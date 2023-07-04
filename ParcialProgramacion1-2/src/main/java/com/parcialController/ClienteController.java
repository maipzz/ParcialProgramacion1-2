package com.parcialController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial.dao.ClienteDao;
import com.parcial.model.Cliente;

@RestController
public class ClienteController {
	@Autowired								
	private ClienteDao clienteDao;

	@RequestMapping(value="api/clientes")
	public List<Cliente> getCliente(){
		List<Cliente> listaClientes=clienteDao.obtenerClientes(); 
		return listaClientes;
	}
}
