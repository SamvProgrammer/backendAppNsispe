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

import com.nominas.web.service.catalogoEmpleadoGeneralService;
import com.nominas.web.models.catalogoGeneralEmpleado;

@RestController
@RequestMapping("/maestro")
public class catalogoEmpleadoGeneralController {
	
	@Autowired
	private catalogoEmpleadoGeneralService obj;
	
	@GetMapping("/general")
	public List<catalogoGeneralEmpleado> getAll()
	{
		return this.obj.getAll();
	}
	
	@GetMapping("/general/{id}")
	public catalogoGeneralEmpleado get(@PathVariable("id") Long id)
	{
		return this.obj.get(id);
	}
	
	@PostMapping("/general")
	public catalogoGeneralEmpleado inserta(@RequestBody catalogoGeneralEmpleado obj)
	{
		return this.obj.inserta(obj);
	}
	
	@PutMapping("/general")
	public catalogoGeneralEmpleado actualiza(@RequestBody catalogoGeneralEmpleado obj)
	{
		return this.obj .actualiza(obj);
	}
  @DeleteMapping("/general/{id}")
  public Map<String , String> elimina(@PathVariable("id") Long id){
	  return this.obj.elimina(id);
  }
  
  
  @PostMapping("/general/lista")
  public List<catalogoGeneralEmpleado> InsertarVarios (@RequestBody List<catalogoGeneralEmpleado> obj)
  {
	  return this.obj.InsertarVarios(obj);
  }
}
