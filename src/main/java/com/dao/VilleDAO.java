package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Ville;

public interface VilleDAO extends JpaRepository<Ville, String>{
	
}
