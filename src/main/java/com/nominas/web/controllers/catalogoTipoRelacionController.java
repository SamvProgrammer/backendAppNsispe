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

import com.nominas.web.models.catalogoTipoRelacion;
import com.nominas.web.service.catalogoTipoRelService;

@RestController
@RequestMapping("/catalogotiporel")

public class catalogoTipoRelacionController {

	@Autowired
	private catalogoTipoRelService obj;
	
	
	@GetMapping("/tiporel")
     public List<catalogoTipoRelacion> getAll()
     {
    	 return this.obj.getAll();
     }
     
     
     @GetMapping("/tiporel/{id}")
     public catalogoTipoRelacion get(@PathVariable("id") Long id)
     {
    	 return this.obj.get(id);
     }
     
     @PostMapping("/tiporel")
     public catalogoTipoRelacion insertar(@RequestBody catalogoTipoRelacion obj)
     {
    	 return this.obj.insertar(obj);
     }
     
     @PutMapping("/tiporel")
     public catalogoTipoRelacion actualiza(@RequestBody catalogoTipoRelacion obj) {
    	 return this.obj.actualizar(obj);
     }
     
     @DeleteMapping("/tiporel/{id}")
     public Map<String , String > eliminar (@PathVariable("id") Long id){
    	 return this.obj.elimina(id);
     }
}
