package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class PermissaoRepositoryImpl implements PermissaoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permissao> list() {
        return manager.createQuery("from Permissao", Permissao.class).getResultList();
    }

    @Transactional
    @Override
    public Permissao save(Permissao permissao) {
        return manager.merge(permissao);
    }

    @Override
    public Permissao findById(Long id) {
        return manager.find(Permissao.class, id);
    }

    @Transactional
    @Override
    public void remove(Permissao permissao) {
        permissao = findById(permissao.getId());
        manager.remove(permissao);
    }
}
