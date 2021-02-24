package com.nominas.web.serviceimp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nominas.web.repository.catalogoPerdedRepository;
import com.nominas.web.service.catalogoPerdedService;
import com.nominas.web.models.catalogoPerded;

@Service
public class catalogoPerdedServiceImp implements  catalogoPerdedService {
	
	@Autowired
	private catalogoPerdedRepository repositorio;
	
	@Override
	public List<catalogoPerded> getAll(){
		List <catalogoPerded> perded = new ArrayList<catalogoPerded>();
		 this.repositorio.findAll().forEach(perded::add);
		return perded;
	}
	
	@Override
	public catalogoPerded get(Long id) {
		Optional <catalogoPerded> perded = this.repositorio.findById(id);
		return perded.get();
	}
	
	@Override
	public  catalogoPerded actualizar(catalogoPerded  obj)
	{
	return	this.repositorio.save(obj);
	}
	
	@Override
	public  catalogoPerded insertar(catalogoPerded  obj)
	{
	return	this.repositorio.save(obj);
	}
	
	@Override
	public Map<String,String> eliminar (Long  id){
		this.repositorio.deleteById(id);
		Map<String , String> resultado= new HashMap<String , String>();
		resultado.put("resultado", "Registro eliminado con exito");
		return resultado;
	}
}
