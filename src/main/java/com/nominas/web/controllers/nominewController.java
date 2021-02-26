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

import com.nominas.web.models.nominew;
import com.nominas.web.service.nominewService;

@RestController
@RequestMapping("/nominew")

public class nominewController {
	
	@Autowired
	private nominewService obj;
	
	@GetMapping("/general")
	public List<nominew>getAll(){
		return this.obj.getAll();
	}
	
	@GetMapping("/general/{id}")
	public nominew get(@PathVariable("id") Long id) {
		return this.obj.get(id);
	}
	
	@PutMapping("/general")
	public nominew actualiza(@RequestBody nominew obj) {
		return this.obj.actualizar(obj);
	}
	
	@PostMapping("/general")
	public nominew insertar(@RequestBody nominew obj) {
		return this.obj.insertar(obj);
	}
	
	@DeleteMapping("/general/{id}")
	public Map<String, String > elimina(@PathVariable ("id")Long id){
	    return this.obj.eliminar(id);
	}
}
