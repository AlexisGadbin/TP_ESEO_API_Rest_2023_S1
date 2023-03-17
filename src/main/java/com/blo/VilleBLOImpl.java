package com.blo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDAO;

import dto.Ville;

@Service
public class VilleBLOImpl implements VilleBLO{

	@Autowired
	private VilleDAO villeDAO;
	
	@Override
	public ArrayList<Ville> getInfoVilles(String codePostal) {
			ArrayList<Ville> listVille = new ArrayList<Ville>();
			// Potentiellement if en fonction du code postal pour rediriger vers une méthode du DAO spécifique
			System.out.println("CODE  " + codePostal);
			if(codePostal == null) {
				listVille = this.villeDAO.findAllVilles();
			} else {
				listVille = this.villeDAO.findVille(codePostal);
			}
			
			
			return listVille;
	}

	@Override
	public void addVille(Ville ville) {
		this.villeDAO.addVille(ville);		
	}

}
