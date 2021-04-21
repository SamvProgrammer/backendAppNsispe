package com.nominas.web.service;

import java.util.List;
import java.util.Map;

import com.nominas.web.models.catalogoGeneralEmpleado;

public interface catalogoEmpleadoGeneralService {

	public List<catalogoGeneralEmpleado> getAll();

	public catalogoGeneralEmpleado get(Long id);

	public catalogoGeneralEmpleado inserta(catalogoGeneralEmpleado obj);

	public catalogoGeneralEmpleado actualiza(catalogoGeneralEmpleado obj);

	public  Map<String, String> elimina(Long id);

	public  List<catalogoGeneralEmpleado> InsertarVarios(List<catalogoGeneralEmpleado> listaE);




}
