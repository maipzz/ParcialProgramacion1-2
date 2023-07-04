package com.parcial.DAO;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.parcial.DAO.ClienteDaoImp;

import java.util.List;
import jakarta.transaction.Transactional;

@Transactional
public interface ClienteDao {
	List<ClienteDao> obtenerClientes();
}

