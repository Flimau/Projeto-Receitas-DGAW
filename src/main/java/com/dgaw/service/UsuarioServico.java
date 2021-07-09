package com.dgaw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgaw.modelos.UsuarioModelo;
import com.dgaw.repository.UsuarioRepositorio;

@Service
public class UsuarioServico {
	

	UsuarioModelo modelo = new UsuarioModelo();

	@Autowired 
	UsuarioRepositorio repositorio;
	
	public int addUsuario(UsuarioModelo usuario) {
		repositorio.save(usuario);
		return usuario.getId();
	}
	

}
