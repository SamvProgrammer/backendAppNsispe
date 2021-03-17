package com.nominas.web.serviceimp;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.management.Query;
import javax.persistence.EmbeddedId;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.nominas.web.models.nominew;
import com.nominas.web.repository.nominewRepository;
import com.nominas.web.service.nominewService;

@Service
public class nominewServiceImp   implements nominewService {
	
	@Autowired
	private nominewRepository reporitory;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<nominew>getAll(){
	   List<nominew> lista = new ArrayList<nominew>();
	    this.reporitory.findAll().forEach(lista::add);
	    return lista;
	}

	
	@Override
	public nominew get(Long id) {
	Optional <nominew> nom= this.reporitory.findById(id);
	return get(id);
		
	}
	
	
	@Override
	public nominew actualizar(nominew obj)
	{
		return this.reporitory.save(obj);
	}
	
	@Override
	public nominew insertar (nominew obj) {
		return this.reporitory.save(obj);
	}
	
	@Override
	public Map<String,String > eliminar(Long id){
		Map<String , String> lista = new HashMap<String , String>();
		this.reporitory.deleteById(id);
		lista.put("resultado", "Registro eliminado con exito");
		return lista;
	}
	
	
	@Override
	public List<nominew> Filtrar(Integer numjpp , String jpp , String tiponomina) {
		   List<nominew> lista = new ArrayList<nominew>();
	    this.reporitory.findByJppNum(jpp, numjpp, tiponomina).forEach(lista::add);;
	    return lista;
	
	}
	
	@Override
	public nominew avanzarSerie() {
		 this.reporitory.avanzaSerie();
		 return null;
	}
	
	
	public Object nominaDetalle(String tipoNomina) {
		String query = "SELECT CONCAT (a1.jpp, a1.num) AS proyecto, a1.nombre,a1.curp,a1.rfc,a2.clave,a2.descri,a2.monto,a2.pagon,a2.pagot FROM maestro a1 JOIN nominew a2 ON a1.num = a2.numjpp\r\n" + 
				" AND a1.jpp = a2.jpp WHERE a1.jpp = a2.jpp AND a1.jpp ='%1$s' ORDER BY a1.jpp, a1.num, a2.clave";
		query = String.format(query, tipoNomina);
		List<Map<String,Object>> lista = this.jdbcTemplate.queryForList(query);
		return lista;
	
	}
	
	public Object generaRespaldo(String quincena , String tiponomina) {
		String query= "SELECT a2.jpp, a2.numjpp,a2.clave,a2.secuen,a2.descri, a2.pagon ,a2.pagot,a2.tipopago,a2.monto,a2.folio FROM maestro a1 LEFT JOIN nominew a2 ON a1.jpp = a2.jpp AND a1.num = a2.numjpp where a2.tiponomina='"+tiponomina+"'" ;
		List<Map<String , Object>> lista = this.jdbcTemplate.queryForList(query);
		for (Map<String, Object> map : lista) {
			 String jpp = String.valueOf(map.get("jpp"));
			 Integer numjpp=  Integer.parseInt(String.valueOf(map.get("numjpp")));
			 Integer secuen=  Integer.parseInt(String.valueOf(map.get("secuen")));
			 Integer clave=  Integer.parseInt(String.valueOf(map.get("clave")));
			 String descri = String.valueOf(map.get("descri"));
			 String tipopago = String.valueOf(map.get("tipopago"));

			 String pagon = String.valueOf(map.get("pagon"));
			 String pagot = String.valueOf(map.get("pagot"));
			 Double monto=  Double.parseDouble(String.valueOf(map.get("monto")));
			 String folio = String.valueOf(map.get("folio"));
				String inserta ="insert into respaldos_nominew (jpp , numjpp , clave , secuen , descri , pagon , pagot , tipopago , monto , folio , archivo , tiponomina) values ('"+jpp+"' ,"+ numjpp +", "+clave+" , "+secuen+",'"+ descri +"',  "+ pagon +" , "+ pagot +" , '"+ tipopago +"',"+ monto +","+ folio +",'"+quincena+"','"+tiponomina+"' )";
                 String.format(inserta);
                    this.jdbcTemplate.update(inserta);
		}
		
				return null;
		}

	}

