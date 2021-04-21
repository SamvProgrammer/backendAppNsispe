package com.nominas.web.serviceimp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nominas.web.models.users;
import com.nominas.web.repository.usersRepository;
import com.nominas.web.service.*;
@Service
public class UsersServiceImp implements usersService {

	@Autowired
	
	private usersRepository repository;
	
	@Override
	public List<users>getAll()
	{
		List<users> lista = new ArrayList<users>();
		this.repository.findAll().forEach(lista::add);
		return lista;
	}
	
	
	@Override
	public List<users> Logeo(String usuario , String password){
		List<users> lista = new ArrayList<users>();
		this.repository.findByUser(usuario, password).forEach(lista::add);
		return lista ;
	}
	
	
	@Override
	public users get (Long id)
	{
		Optional<users> optional = this.repository.findById(id);
		return get(id);
	}
	
	@Override
	public users actualizar (users obj) {
		return this.repository.save(obj);
	}
	
	@Override
	public users insertar (users obj) {
		return this.repository.save(obj);
	}
	
	
	@Override
	public Map<String , String> eliminar(Long id){
		Map<String , String> lista = new HashMap<String , String>();
		this.repository.deleteById(id);
		lista.put("resultado", "Registro eliminado con exito");
		return lista;
	}
	
}
