package com.nominas.web.service;
import java.util.List;
import java.util.Map;

import com.nominas.web.models.CatalogoTipoEmpleados;

public interface catalogoTipoEmpleadoService  {
	public List<CatalogoTipoEmpleados>getAll();

	public CatalogoTipoEmpleados get(Long id);

	 public CatalogoTipoEmpleados actualiza(CatalogoTipoEmpleados obj);

	public CatalogoTipoEmpleados inserta(CatalogoTipoEmpleados obj);
	public Map<String, String> elimina (Long id);


}
