package com.nominas.web.service;

import java.util.List;
import java.util.Map;

import com.nominas.web.models.nominew;

public interface nominewService {

	public List<nominew> getAll();

	public nominew get(Long id);

	public  nominew actualizar(nominew obj);

	public  nominew insertar(nominew obj);

	public  Map<String, String> eliminar(Long id);

	public List<nominew> Filtrar(Integer numjpp, String jpp , String tiponomina);

	public  nominew avanzarSerie();

	public Object nominaDetalle (String tipoNomina);
	
	public Object generaRespaldo(String quincena , String tiponomina);

	public List<nominew> InsertarVarios(List<nominew> listaN);




	
	

}
