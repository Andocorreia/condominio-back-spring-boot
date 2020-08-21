package com.orquestrador.condominio.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.orquestrador.condominio.core.enums.TipoTelefone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="telefone")
@Getter
@Setter
@NoArgsConstructor
public class TelefoneEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;

	@Enumerated(EnumType.STRING)
	private TipoTelefone tipo;

	@ManyToOne
	private PessoaEntity pessoaId;
}