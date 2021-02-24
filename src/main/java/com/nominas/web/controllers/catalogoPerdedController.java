package com.nominas.web.controllers;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nominas.web.models.catalogoPerded;
import com.nominas.web.service.catalogoPerdedService;

@RestController
@RequestMapping("/catalogoperded")

public class catalogoPerdedController {

@Autowired
private catalogoPerdedService obj;

@GetMapping("/perded")
public List<catalogoPerded> getAll(){
	return this.obj.getAll();
}

@GetMapping("/perded/{id}")
public catalogoPerded get(@PathVariable("id") Long id) {
	return this.obj.get(id);
}

@PostMapping("/perded")
public catalogoPerded insertar(@RequestBody catalogoPerded obj) {
   return this.obj.insertar(obj);
}

@PutMapping("/perded")
public catalogoPerded actualizar (@RequestBody catalogoPerded obj) {
	return this.obj.actualizar(obj);
}


@DeleteMapping("/perded/{id}")
public Map<String, String> eliminar (@PathVariable("id") Long id){
	return this.obj.eliminar(id);
}
}
