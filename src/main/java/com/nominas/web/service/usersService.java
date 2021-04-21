package com.nominas.web.service;

import java.util.List;
import java.util.Map;

import com.nominas.web.models.users;

public interface usersService {

public 	List<users> getAll();

public     users get(Long id);

public    users actualizar(users obj);

public  users insertar(users obj);

public  Map<String, String> eliminar(Long id);

public  List<users> Logeo(String usuario, String password);



}
