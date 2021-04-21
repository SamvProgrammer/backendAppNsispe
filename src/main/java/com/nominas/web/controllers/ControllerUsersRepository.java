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
import com.nominas.web.models.users;
import com.nominas.web.repository.usersRepository;
import com.nominas.web.service.usersService;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsersRepository {
	
	@Autowired
	private usersService obj;
	
	
	@GetMapping("/control")
	public List<users> getAll(){
		return this.obj.getAll();
	}
	
	@GetMapping("/control/{id}")
	public users get(@PathVariable ("id") Long id) {
		return this.obj.get(id);
	}
	
	@PostMapping("/control")
	public users insertar(@RequestBody users obj) {
		return this.obj.insertar(obj);
	}

	@PutMapping("/control")
	public users actualizar (@RequestBody users obj) {
		return this.obj.actualizar(obj);
	}
	
	@DeleteMapping("/control/{id}")
	public Map<String , String > users (@PathVariable ("id") Long id){
		return this.obj.eliminar(id);
	}
	
	@GetMapping("/control/{usuario}/{password}")
	public List <users> Logeo (@PathVariable ("usuario") String usuario , @PathVariable ("password") String password ){
		return this.obj.Logeo(usuario, password);
	}
	

}
