package com.parcialController;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parcial.DAO.UsuarioDao;
import com.parcial.model.ClienteModel;

@RestController
public class UsuarioController {
	@Autowired								//Permite acceder a UsuarioDao, que es una interface implementada en la clase UsuarioDaoImp.
	private UsuarioDao usuarioDao;

	@RequestMapping(value="saludo")
	public String saludo(){
		return "Hola Mundo";
	}

	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Diego", "Juan", "José", "Roberto");
	}

	@RequestMapping(value="crearUsuario")
	public Usuario crearUsuario() {
		Usuario usuario1=new Usuario();
		usuario1.setId(1L);
		usuario1.setNombre("Mailen");
		usuario1.setApellido("Paez");
		usuario1.setEmail("mmaipzz15@gmail.com");
		usuario1.setTeléfono("2616866574");
		usuario1.setPassword("878h766d5");
		return usuario1;
	}

	@RequestMapping(value="getUsuarioPorID/{id}")
	public Usuario getUsuarioPorID(@PathVariable Long id) {
		Usuario usuario2=new Usuario();
		usuario2.setId(id);
		usuario2.setNombre("Joaquin");
		usuario2.setApellido("Nunez");
		usuario2.setEmail("joaconunez@gmail.com");
		usuario2.setTeléfono("261432156");
		usuario2.setPassword("86tg7yb");
		return usuario2;
	}

	@RequestMapping(value="listar/usuarios")
	public List<Usuario> listarUsuarios() {
		List<Usuario> listaUsuarios=new ArrayList<>();
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Agustina");
		usuario1.setApellido("Sosa");
		usuario1.setEmail("agussosa@gmail.com");
		usuario1.setTeléfono("2618907654");
		usuario1.setPassword("09j9nhgv");

		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Lucas");
		usuario2.setApellido("Hernandez");
		usuario2.setEmail("hernandeslu@gmail.com");
		usuario2.setTeléfono("2610784352");
		usuario2.setPassword("65fc65");

		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);

		return listaUsuarios;
	}

	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		List<Usuario> listaUsuarios2=usuarioDao.obtenerUsuarios();		
		return listaUsuarios2;
	}
}
