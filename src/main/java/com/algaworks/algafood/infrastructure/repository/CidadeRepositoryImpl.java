package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cidade> list() {
        return manager.createQuery("from Cidade", Cidade.class).getResultList();
    }

    @Transactional
    @Override
    public Cidade save(Cidade cidade) {
        return manager.merge(cidade);
    }

    @Override
    public Cidade findById(Long id) {
        return manager.find(Cidade.class, id);
    }

    @Transactional
    @Override
    public void remove(Cidade cidade) {
        cidade = findById(cidade.getId());
        manager.remove(cidade);
    }
}
