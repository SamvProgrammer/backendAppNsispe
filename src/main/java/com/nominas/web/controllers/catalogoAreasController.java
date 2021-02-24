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

import com.nominas.web.service.catalogoAreasService;
import com.nominas.web.models.catalogoAreas;;

@RestController
@RequestMapping("/catalogoarea")
public class catalogoAreasController {
 
	@Autowired
	private catalogoAreasService obj;
	
	@GetMapping("/oficina")
	public List<catalogoAreas> getAll()
	{
		return this.obj.getAll();
	}
	
	@GetMapping("/oficina/{id}")
	public catalogoAreas get(@PathVariable("id") Long id) {
		return this.obj.get(id);
	}
	
	@PostMapping("/oficina")
	public catalogoAreas inserta(@RequestBody catalogoAreas obj) {
		return this.obj.insertar(obj);
	}
	
	
	@PutMapping("/oficina")
	public catalogoAreas actualiza(@RequestBody catalogoAreas obj) {
		return this.obj.actualizar(obj);
	}
	
	
	@DeleteMapping("/oficina/{id}")
	public Map<String,String> elimina (@PathVariable("id") Long id)
	{
		return this.obj.eliminar(id);
	}
}
