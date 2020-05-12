package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> list();

    Cidade findById(Long id);

    Cidade save(Cidade cidade);

    void remove(Cidade cidade);

}
