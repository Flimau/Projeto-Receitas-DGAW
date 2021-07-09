package com.dgaw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgaw.modelos.ReceitaModelo;
import com.dgaw.repository.ReceitaRepositorio;

@Service
public class ReceitaServico {
	
	ReceitaModelo receita = new ReceitaModelo();
	
	@Autowired
	public ReceitaRepositorio receitaRepositorio;
	
	public int insertReceita(ReceitaModelo r) {
		r = receitaRepositorio.save(r);
		return r.getId();	
	}
	
	public void deletaReceita(Integer id) {
		id=receita.getId();
		receitaRepositorio.deleteById(id);
	}
	
	public List<ReceitaModelo> listaReceitas(){
		
		 return receitaRepositorio.findAll();
		
	}
	
	public ReceitaModelo atualizaReceita(Integer id) {
		id=receita.getId();
		receitaRepositorio.findById(id);
		return receita;
	}

}
