package com.parcial.DAO;

import com.parcial.UsuarioDAO; 

import jakarta.transaction.Transactional;

@Transactional								
public interface UsuarioDao {

	List<Usuario> obtenerUsuarios();

}

