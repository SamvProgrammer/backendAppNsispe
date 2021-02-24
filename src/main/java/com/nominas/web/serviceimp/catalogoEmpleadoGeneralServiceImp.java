package com.nominas.web.serviceimp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nominas.web.repository.catalogoEmpleadoGeneralRepository;
import com.nominas.web.service.catalogoEmpleadoGeneralService;
import com.nominas.web.models.catalogoGeneralEmpleado;;


@Service
public class catalogoEmpleadoGeneralServiceImp implements catalogoEmpleadoGeneralService {
	
	@Autowired
	private catalogoEmpleadoGeneralRepository repository;
	
	@Override
	public List<catalogoGeneralEmpleado>getAll(){
		List<catalogoGeneralEmpleado> resultado = new ArrayList<catalogoGeneralEmpleado>();
		this.repository.findAll().forEach(resultado::add);
		return resultado;
	}
	
	@Override
	public catalogoGeneralEmpleado get(Long id) {
		Optional<catalogoGeneralEmpleado> resultado =  this.repository.findById(id);
		return resultado.get();
	}
	
	@Override
	public catalogoGeneralEmpleado inserta(catalogoGeneralEmpleado obj) {
		return this.repository.save(obj);
	}
	
	@Override
	public catalogoGeneralEmpleado actualiza(catalogoGeneralEmpleado obj) {
		return this.repository.save(obj);
	}
	
	@Override
	public Map<String , String> elimina(Long id){
		Map<String, String> resultado = new HashMap<String , String>();
		this.repository.deleteById(id);
		resultado.put("resultado", "Registro eliminado con exito");
		return resultado;
	}

}
