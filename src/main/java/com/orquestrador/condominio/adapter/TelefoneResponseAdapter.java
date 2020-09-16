package com.orquestrador.condominio.adapter;

import java.util.Collection;
import java.util.stream.Collectors;

import com.orquestrador.condominio.entity.TelefoneEntity;
import com.orquestrador.condominio.response.TelefoneResponse;

public class TelefoneResponseAdapter implements Adapter<Collection<TelefoneResponse>, Collection<TelefoneEntity>> {

	@Override
	public Collection<TelefoneResponse> convert(final Collection<TelefoneEntity> entity) {
		return entity.stream().map(this::getResponseFromEntity).collect(Collectors.toList());
	}

	private TelefoneResponse getResponseFromEntity(final TelefoneEntity entity) {
		final TelefoneResponse telefone = new TelefoneResponse();
		telefone.setId(entity.getId());
		telefone.setNumero(entity.getNumero());
		telefone.setComplemento(entity.getComplemento());
		telefone.setTipo(entity.getTipo());
		return telefone;
	}

}
