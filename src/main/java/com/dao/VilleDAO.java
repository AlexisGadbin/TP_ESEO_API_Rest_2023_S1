package com.dao;

import java.util.ArrayList;

import dto.Ville;

public interface VilleDAO {
	public ArrayList<Ville> findAllVilles();
	public ArrayList<Ville> findVille(String codePostal);
	public void addVille(Ville ville);
}
