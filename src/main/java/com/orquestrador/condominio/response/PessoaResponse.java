package com.orquestrador.condominio.response;

import java.time.LocalDate;
import java.util.Collection;

import com.orquestrador.condominio.core.enums.Classificacao;
import com.orquestrador.condominio.core.enums.EstadoCivil;
import com.orquestrador.condominio.core.enums.Sexo;
import com.orquestrador.condominio.core.enums.Situacao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaResponse {

	private Long id;

	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private String rg;
	private EstadoCivil estadoCivil;
	private Sexo sexo;
	private String email;
	private Situacao situacao;
	private Classificacao classificacao;

	private Collection<EnderecoResponse> enderecos;
	private Collection<TelefoneResponse> telefones;
	private Collection<ApartamentoResponse> apartamentos;
}
