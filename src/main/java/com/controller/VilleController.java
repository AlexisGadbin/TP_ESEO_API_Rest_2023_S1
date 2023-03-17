package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBLO;

import dto.Ville;

@RestController
public class VilleController {
	
	@Autowired
	VilleBLO villeBLOService;
	
	
	@RequestMapping(value="/ville", method=RequestMethod.GET)
	public ArrayList<Ville> get(@RequestParam(required=false, value="codePostal") String codePostal) {
		System.out.println("get" + codePostal);
		
		ArrayList<Ville> listeVille = villeBLOService.getInfoVilles(codePostal);
		
		return listeVille;
	}
	
	@GetMapping("/ville/{codePostal}")
	public ArrayList<Ville> getVilleByCodePostal(@PathVariable String codePostal) {
		System.out.println("get par code postal");
		
		ArrayList<Ville> ville = villeBLOService.getInfoVilles(codePostal);
		
		return ville;
	}
	
	@PostMapping(value="/ville", consumes="application/json", produces="application/json")
	public void post(@RequestBody Ville ville) {
	
		villeBLOService.addVille(ville);
	}
}
