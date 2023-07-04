package com.parcial.DAO;
import java.util.List;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.parcial.DAO.ClienteDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository									
@Transactional
public class ClienteDaoImp implements ClienteDao{
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Cliente> obtenerClientes() {
		String query="from Cliente";
		return entityManager.createQuery(query).getResultList();
	}
}

