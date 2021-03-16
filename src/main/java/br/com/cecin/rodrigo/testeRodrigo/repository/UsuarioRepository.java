/**
 * 
 */
package br.com.cecin.rodrigo.testeRodrigo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.cecin.rodrigo.testeRodrigo.model.Usuario;
import br.com.cecin.rodrigo.testeRodrigo.vo.UsuarioVo;

/**
 * @author cecin
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	

	
	 @Query(value = "SELECT new  br.com.cecin.rodrigo.testeRodrigo.vo.UsuarioVo (u.id as usuarioId,i.id as imagemId, u.nome,i.foto , u.nascimento ) "
				+ " FROM Usuario u LEFT JOIN Imagem i on (u.imagem = i.id) "
			 )
	 ArrayList<UsuarioVo> listUsuario();


	 
	 
	 @Query(value = "SELECT new  br.com.cecin.rodrigo.testeRodrigo.vo.UsuarioVo (u.id as usuarioId,i.id as imagemId, u.nome,i.foto , u.nascimento ) "
				+ " FROM Usuario u LEFT JOIN Imagem i on (u.imagem = i.id) WHERE u.id = ?1"
			 )
	UsuarioVo findVoById(Long userId);

}
