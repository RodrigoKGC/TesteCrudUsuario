/**
 * 
 */
package br.com.cecin.rodrigo.testeRodrigo.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author cecin
 *
 */
public class UsuarioVo {
	

	private Long usuarioId;
	
	private Long imagemId;

	
	private String nome;
	
    private byte[] foto;
    
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date nascimento;
	

	public UsuarioVo() {
		super();
		
	}


	public UsuarioVo(Long usuarioId, Long imagemId, String nome, byte[] foto, Date nascimento) {
		super();
		this.usuarioId = usuarioId;
		this.imagemId = imagemId;
		this.nome = nome;
		this.foto = foto;
		this.nascimento = nascimento;
	}




	public Long getUsuarioId() {
		return usuarioId;
	}




	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}




	public Long getImagemId() {
		return imagemId;
	}




	public void setImagemId(Long imagemId) {
		this.imagemId = imagemId;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public byte[] getFoto() {
		return foto;
	}




	public void setFoto(byte[] foto) {
		this.foto = foto;
	}




	public Date getNascimento() {
		return nascimento;
	}




	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


    


}
