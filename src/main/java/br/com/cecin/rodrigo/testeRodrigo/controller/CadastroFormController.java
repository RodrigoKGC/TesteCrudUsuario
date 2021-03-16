/**
 * 
 */
package br.com.cecin.rodrigo.testeRodrigo.controller;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.cecin.rodrigo.testeRodrigo.model.Usuario;
import br.com.cecin.rodrigo.testeRodrigo.service.CadastroFormService;
import br.com.cecin.rodrigo.testeRodrigo.vo.UsuarioVo;

/**
 * @author cecin
 *
 */
@RestController
@RequestMapping("/api/cadastro-form")
public class CadastroFormController {

	@Autowired
	CadastroFormService service;

	//Cria (vo sem ids) ou realiza update (caso vo possua img id e user id)
	@PostMapping
	public ResponseEntity<Object> saveUsuario(@RequestBody UsuarioVo us){
		Usuario usuario = this.service.saveUsuario(us);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("{id}")
				.buildAndExpand(usuario.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@GetMapping("/list")
	public ArrayList<UsuarioVo> listUsuario() {
		return this.service.listUsuario();

	}

	@GetMapping("/{id}")
	public UsuarioVo getUsuario(@PathVariable Long id) throws Exception {
		return this.service.getUsuario(id);

	}

	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable Long id){
		this.service.deleteUsuario(id);

	}








}
