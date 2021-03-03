package com.nominas.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nominas.web.models.nominew;

public interface nominewRepository  extends CrudRepository<nominew, Long>{
	
	
	@Query("select u from nominew u where  u.jpp=?1 and u.numjpp=?2 order by clave")
	 List<nominew> findByJppNum(String  jpp , Integer numjpp);

}
