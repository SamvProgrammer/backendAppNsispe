package com.nominas.web.serviceimp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nominas.web.service.catalogoTipoEmpleadoService;
import com.nominas.web.models.CatalogoTipoEmpleados;
import com.nominas.web.repository.catalogoTipoEmpleadoRepository;
@Service
public class catalogoTipoEmpleadoServiceImp implements catalogoTipoEmpleadoService {
	@Autowired
	private catalogoTipoEmpleadoRepository  repository;
	
	@Override
	public List<CatalogoTipoEmpleados> getAll(){
		List<CatalogoTipoEmpleados> TipoEmpleado= new ArrayList<CatalogoTipoEmpleados>();
		this.repository.findAll().forEach(TipoEmpleado::add);
		return TipoEmpleado;
	}
	
	@Override
	public CatalogoTipoEmpleados get(Long id) {
		Optional<CatalogoTipoEmpleados> TipoEmplea = this.repository.findById(id);
		return TipoEmplea.get();
	}
	
	@Override
	public CatalogoTipoEmpleados actualiza(CatalogoTipoEmpleados obj) {
		return this.repository.save(obj);
	}
	
	@Override
	public CatalogoTipoEmpleados inserta(CatalogoTipoEmpleados obj) {
		return this.repository.save(obj);
	}
	
	@Override
	public Map<String, String> elimina (Long id){
		this.repository.deleteById(id);
		Map<String, String> resultado = new HashMap<>();
		return resultado;
	}
	
	

}
