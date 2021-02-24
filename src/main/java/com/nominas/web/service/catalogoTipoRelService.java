package com.nominas.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;

import com.nominas.web.models.catalogoTipoRelacion;

public interface catalogoTipoRelService {
	
	public List<catalogoTipoRelacion>getAll();

	public catalogoTipoRelacion get(Long id);

	public catalogoTipoRelacion insertar(catalogoTipoRelacion obj);

	public catalogoTipoRelacion actualizar(catalogoTipoRelacion obj);

	public Map<String, String> elimina(Long id);

}
