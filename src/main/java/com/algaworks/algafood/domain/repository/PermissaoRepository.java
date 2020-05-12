package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.Permissao;

import java.util.List;

public interface PermissaoRepository {

    List<Permissao> list();

    Permissao findById(Long id);

    Permissao save(Permissao permissao);

    void remove(Permissao permissao);

}
