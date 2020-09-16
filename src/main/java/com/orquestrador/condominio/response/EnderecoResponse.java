package com.orquestrador.condominio.response;

import com.orquestrador.condominio.core.enums.TipoEndereco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoResponse {
	private Long id;
	private TipoEndereco tipo;
	private String rua;
	private String numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;
	private String pais;
}
