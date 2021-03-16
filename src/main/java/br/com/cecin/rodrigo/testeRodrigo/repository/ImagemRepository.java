/**
 * 
 */
package br.com.cecin.rodrigo.testeRodrigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cecin.rodrigo.testeRodrigo.model.Imagem;

/**
 * @author cecin
 *
 */
public interface ImagemRepository extends JpaRepository<Imagem, Long> {

}
