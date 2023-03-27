package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Ville;

public interface VilleDAO extends JpaRepository<Ville, String>{
	
}
