package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.VilleDAO;
import com.model.Ville;

@RestController
@CrossOrigin
public class VilleController {
	
	@Autowired
	VilleDAO villeDAO;
	
	@GetMapping("/ville")
	public List<Ville> getVilles() {
		return villeDAO.findAll();
	}
	
	@GetMapping("/ville/{codeCommune}")
	public Optional<Ville> getVille(@PathVariable("codeCommune") String codeCommune) {
		return villeDAO.findById(codeCommune);
	}
	
	@PostMapping("/ville")
	public Ville addVille(@RequestBody Ville ville) {
		return villeDAO.save(ville);
	}
	
	@DeleteMapping("/ville/{codeCommune}")
	public void deleteVille(@PathVariable("codeCommune") String codeCommune) {
		if(villeDAO.existsById(codeCommune)) {
			villeDAO.deleteById(codeCommune);
		}
	}
	
	@PutMapping("/ville")
	public void updateVille(@RequestBody Ville ville) {
		villeDAO.save(ville);
	}
	
	
	
}
