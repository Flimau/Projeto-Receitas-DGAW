package com.dgaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgaw.modelos.UsuarioModelo;

public interface UsuarioRepositorio extends JpaRepository<UsuarioModelo, Integer>{

}
