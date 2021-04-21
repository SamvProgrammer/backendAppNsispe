package com.nominas.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nominas.web.models.users;

public interface usersRepository  extends CrudRepository<users, Long>{
	
	@Query(value =  "SELECT * FROM usuarios where usuario=?1 and password=?2" , nativeQuery=true)
         List<users> findByUser( String usuario , String password);
}
