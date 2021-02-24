package com.nominas.web.serviceimp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nominas.web.repository.catalogoAreaRepository;
import com.nominas.web.service.catalogoAreasService;
import com.nominas.web.models.catalogoAreas;

@Service
public class catalogoAreasServiceImp implements catalogoAreasService{

	
	@Autowired
	private catalogoAreaRepository repository;
	
	@Override
	public List<catalogoAreas>getAll(){
	List<catalogoAreas> lista = new ArrayList<catalogoAreas>();
	  this.repository.findAll().forEach(lista::add);
	  return lista;
	}
	
	
	
	@Override
	public catalogoAreas get(Long id){
		Optional<catalogoAreas> elemento = this.repository.findById(id);
		return elemento.get();
		
	}
	
	@Override
	public catalogoAreas insertar(catalogoAreas obj) {
		return this.repository.save(obj);
	}
	
	@Override
	public catalogoAreas actualizar(catalogoAreas obj) {
		return this.repository.save(obj);
	}
	
	@Override
	public Map<String , String> eliminar(Long id){
		Map<String , String > resultado = new HashMap<String , String>();
		resultado.put("resultado", "Registro eliminado con exito");
		this.repository.deleteById(id);
		return resultado;
	}
}
