package com.nominas.web.service;

import java.util.List;
import java.util.Map;

import com.nominas.web.models.catalogoAreas;

public interface catalogoAreasService {

	public  List<catalogoAreas> getAll();

	public catalogoAreas get(Long id);

	public catalogoAreas actualizar(catalogoAreas obj);

	public catalogoAreas insertar(catalogoAreas obj);

	public  Map<String, String> eliminar(Long id);

}
