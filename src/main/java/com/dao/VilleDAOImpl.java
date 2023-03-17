package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import dto.Ville;

@Repository
public class VilleDAOImpl implements VilleDAO{
	
	public ArrayList<Ville> findAllVilles() {
		System.out.println("findAllVilles");
		
		ArrayList<Ville> listVilles = new ArrayList<Ville>();
		
		try{  
			Connection con = this.getConnection();
			Statement stmt = con.createStatement();  
			ResultSet rs = stmt.executeQuery("select * from ville_france"); 
			
			while(rs.next()) {
				Ville ville = new Ville();
				ville.setCodePostal(rs.getString("Code_postal"));
				ville.setLigne(rs.getString("Ligne_5"));
				ville.setNomCommune(rs.getString("Nom_commune"));
				listVilles.add(ville);
			}
			con.close();  
		} catch(Exception e) { 
			System.out.println(e);
		}  
		
		return listVilles;
	}
	
	@Override
	public ArrayList<Ville> findVille(String codePostal) {
		System.out.println("findVille");
		
		ArrayList<Ville> listVilles = new ArrayList<Ville>();
		
		try{  
			Connection con = this.getConnection();
			Statement stmt = con.createStatement();  
			ResultSet rs = stmt.executeQuery("select * from ville_france WHERE Code_postal = " + codePostal); 
			
			while(rs.next()) {
				Ville ville = new Ville();
				ville.setCodePostal(rs.getString("Code_postal"));
				ville.setLigne(rs.getString("Ligne_5"));
				ville.setNomCommune(rs.getString("Nom_commune"));
				listVilles.add(ville);
			}
			con.close();  
		} catch(Exception e) { 
			System.out.println(e);
		}  
		
		return listVilles;
	}
	
	
	
	private Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/villes_france","root",""); 
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;  
		
		
	}



	@Override
	public void addVille(Ville ville) {
		System.out.println("addVille");
		
		try{  
			Connection con = this.getConnection();
			Statement stmt = con.createStatement();  
			ResultSet rs = stmt.executeQuery("INSERT INTO villes_france VALUES()"); 
			
			con.close();  
		} catch(Exception e) { 
			System.out.println(e);
		}  
	}




}
