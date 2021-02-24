package com.nominas.web.service;
import java.util.List;
import java.util.Map;

import com.nominas.web.models.catalogoPerded;

public interface catalogoPerdedService {
	
	public List<catalogoPerded> getAll();
	public catalogoPerded get(Long id);
	public  catalogoPerded actualizar(catalogoPerded  obj);
	public  catalogoPerded insertar(catalogoPerded  obj);
	public Map<String,String> eliminar (Long  id);
}
