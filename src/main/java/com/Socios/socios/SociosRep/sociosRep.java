package com.Socios.socios.SociosRep;

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Socios.socios.Socios.sociosClass;

@Repository
public interface sociosRep extends JpaRepository<sociosClass, Long> {

	Optional<sociosClass> findById(Long Id);
	List<sociosClass> findAll();
	
	//@Query("SELECT REST FROM socios REST")
	//public List<sociosClass> findCantidad();
	
	
}
