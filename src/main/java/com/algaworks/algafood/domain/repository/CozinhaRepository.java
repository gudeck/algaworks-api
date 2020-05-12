package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Cozinha;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> list();

    Cozinha findById(Long id);

    Cozinha save(Cozinha cozinha);

    Cozinha remove(Long id);

}
