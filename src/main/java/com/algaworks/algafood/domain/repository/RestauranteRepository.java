package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> list();

    Restaurante findById(Long id);

    Restaurante save(Restaurante restaurante);

    void remove(Restaurante restaurante);

}

