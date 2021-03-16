/**
 * 
 */
package br.com.cecin.rodrigo.testeRodrigo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.cecin.rodrigo.testeRodrigo.model.Imagem;
import br.com.cecin.rodrigo.testeRodrigo.model.Usuario;
import br.com.cecin.rodrigo.testeRodrigo.repository.ImagemRepository;
import br.com.cecin.rodrigo.testeRodrigo.repository.UsuarioRepository;
import br.com.cecin.rodrigo.testeRodrigo.vo.UsuarioVo;

/**
 * @author cecin
 *
 */
@Service
public class CadastroFormService {
	@Autowired
	private UsuarioRepository userRepository;

	@Autowired
	private ImagemRepository imgRepository;

	//Cria (vo sem ids) ou realiza update (caso vo possua img id e user id)
	@Transactional
	public Usuario saveUsuario(@RequestBody UsuarioVo us){
		Usuario usuario =  us.getUsuarioId() != null ? userRepository.findById(us.getUsuarioId()).orElse(new Usuario()) : new Usuario();
		Imagem img =  us.getImagemId() != null ? imgRepository.findById(us.getImagemId()).orElse(new Imagem()) : new Imagem();

		img.setFoto(us.getFoto());
		this.imgRepository.save(img);
		usuario.setNome(us.getNome());
		usuario.setImagem(img);
		usuario.setNascimento(us.getNascimento());
		usuario = this.userRepository.save(usuario);
		return usuario;
		

	}

	public UsuarioVo getUsuario(Long id) throws Exception{
		UsuarioVo user = this.userRepository.findVoById(id);
		if(user == null) throw new Exception ("Usuario não encontrado");
		return user;

	}

	public void deleteUsuario(Long id){
		this.userRepository.deleteById(id);

	}

	public ArrayList<UsuarioVo> listUsuario() {
		return this.userRepository.listUsuario();
	}
}
