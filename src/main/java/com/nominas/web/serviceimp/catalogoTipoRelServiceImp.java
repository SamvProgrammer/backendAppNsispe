package com.nominas.web.serviceimp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nominas.web.models.catalogoTipoRelacion;
import com.nominas.web.repository.catalogoTipoRelRepository;
import com.nominas.web.service.catalogoTipoRelService;

@Service
public class catalogoTipoRelServiceImp implements catalogoTipoRelService {
	@Autowired
	private catalogoTipoRelRepository repository;
	
	@Override
	public List<catalogoTipoRelacion>getAll(){
		List<catalogoTipoRelacion> TipoRelacion = new ArrayList<catalogoTipoRelacion>();
		this.repository.findAll().forEach(TipoRelacion::add);
		return TipoRelacion;
	}
	
	@Override
	public catalogoTipoRelacion get(Long id) {
		Optional< catalogoTipoRelacion> TipoRel = this.repository.findById(id);
		return TipoRel.get();
				
	}
	
	@Override 
	public catalogoTipoRelacion actualizar(catalogoTipoRelacion  obj) 
	{
		return this.repository.save(obj);
	}
	@Override 
	public catalogoTipoRelacion insertar(catalogoTipoRelacion  obj) 
	{
		return this.repository.save(obj);
	}
	
	@Override
	public Map<String, String> elimina(Long id){
		this.repository.deleteById(id);
		Map<String , String> resultado = new HashMap<String , String>();
		resultado.put("resultado", "Registro eliminado con exito");
		return resultado;
	}
	
}
