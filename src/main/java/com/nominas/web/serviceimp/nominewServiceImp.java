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
import org.springframework.stereotype.Service;

import com.nominas.web.models.nominew;
import com.nominas.web.repository.nominewRepository;
import com.nominas.web.service.nominewService;

@Service
public class nominewServiceImp   implements nominewService {
	
	@Autowired
	private nominewRepository reporitory;
	
	
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
	public List<nominew> Filtrar(Integer numjpp , String jpp) {
		   List<nominew> lista = new ArrayList<nominew>();
	    this.reporitory.findByJppNum(jpp, numjpp).forEach(lista::add);
	    return lista;
	
	}
	
	
	
}
