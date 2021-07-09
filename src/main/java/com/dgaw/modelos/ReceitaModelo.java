package com.dgaw.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity			
public class ReceitaModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReceita;
	private String nomeReceita;
	private String ingredientes;
	private String modoPreparo;
	
	public int getId() {
		return idReceita;
	}
	public void setId(int id) {
		this.idReceita = id;
	}
	public String getNomeReceita() {
		return nomeReceita;
	}
	public void setNomeReceita(String nomeReceita) {
		this.nomeReceita = nomeReceita;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getModoPreparo() {
		return modoPreparo;
	}
	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}

}
