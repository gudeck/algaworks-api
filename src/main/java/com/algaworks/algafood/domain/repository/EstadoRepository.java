package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> list();

    Estado findById(Long id);

    Estado save(Estado estado);

    void remove(Estado estado);

}
