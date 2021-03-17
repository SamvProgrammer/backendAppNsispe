package com.nominas.web.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nominas.web.models.nominew;

public interface nominewRepository  extends CrudRepository<nominew, Long>{
	
	
	@Query("select u from nominew u where  u.jpp=?1 and u.numjpp=?2 and u.tiponomina=?3 order by clave")
	 List<nominew> findByJppNum(String  jpp , Integer numjpp , String tiponomina);
	 
	 @Transactional
	 @Modifying(clearAutomatically=true , flushAutomatically=true)
    @Query(value ="update nominew  set pagon=pagon+1 where (pagon<=pagot)and pagon<>0 and pagot<>0; delete FROM nominew where pagon > pagot " ,nativeQuery = true)
    void avanzaSerie();
	 

}
