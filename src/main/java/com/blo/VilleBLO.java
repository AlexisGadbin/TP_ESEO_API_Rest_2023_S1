package com.blo;

import java.util.ArrayList;

import dto.Ville;

public interface VilleBLO {
	public ArrayList<Ville> getInfoVilles(String codePostal);
	public void addVille(Ville ville);
}
