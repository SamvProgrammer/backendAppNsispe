package com.nominas.web.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nominas.web.service.catalogoTipoEmpleadoService;
import com.nominas.web.models.*;

@RestController
@RequestMapping("/catalogotipoempleado")


public class catalogoTipoEmpleadoController {
	
	@Autowired
	private  catalogoTipoEmpleadoService obj;
	
	@GetMapping("/tipoemplea")
	public List<CatalogoTipoEmpleados>getAll(){
		return this.obj.getAll();
	}
	
	@GetMapping("/tipoemplea/{id}")
	public CatalogoTipoEmpleados get(@PathVariable("id") Long id) {
		return this.obj.get(id);
	}
	
	@PutMapping("/tipoemplea")
	public CatalogoTipoEmpleados actualiza(@RequestBody CatalogoTipoEmpleados obj ) {
		return this.obj.actualiza(obj);
	}
	
	@PostMapping("/tipoemplea")
		public CatalogoTipoEmpleados inserta(@RequestBody CatalogoTipoEmpleados obj ) {
			return this.obj.inserta(obj);
		}
	
	
	@DeleteMapping("/tipoemplea/{id}")
	public Map<String , String> eliminar(@PathVariable("id") Long id) {
		return this.obj.elimina(id);
	}
	

}
