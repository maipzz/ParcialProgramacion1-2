import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programaEjemplo4.dao.UsuarioDao;
import com.programaEjemplo4.model.Usuario;

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
		usuario1.setNombre("Nacho");
		usuario1.setApellido("Felipe");
		usuario1.setEmail("nachofelipe46@gmail.com");
		usuario1.setTeléfono("2994731241");
		usuario1.setPassword("hola1234");
		return usuario1;
	}

	@RequestMapping(value="getUsuarioPorID/{id}")
	public Usuario getUsuarioPorID(@PathVariable Long id) {
		Usuario usuario2=new Usuario();
		usuario2.setId(id);
		usuario2.setNombre("Pablo");
		usuario2.setApellido("Perez");
		usuario2.setEmail("pablito@gmail.com");
		usuario2.setTeléfono("2994731241");
		usuario2.setPassword("hola1234");
		return usuario2;
	}

	@RequestMapping(value="listar/usuarios")
	public List<Usuario> listarUsuarios() {
		List<Usuario> listaUsuarios=new ArrayList<>();
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Pablo");
		usuario1.setApellido("Perez");
		usuario1.setEmail("pablito@gmail.com");
		usuario1.setTeléfono("2994731241");
		usuario1.setPassword("hola1234");

		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Martín");
		usuario2.setApellido("Caute");
		usuario2.setEmail("cautegolo@gmail.com");
		usuario2.setTeléfono("2994731241");
		usuario2.setPassword("hola1234");

		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);

		return listaUsuarios;
	}

	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		List<Usuario> listaUsuarios2=usuarioDao.obtenerUsuarios();		//llama al método de la interface UsuarioDao que es implementado en UsuarioDaoImp. 
		return listaUsuarios2;
	}
}