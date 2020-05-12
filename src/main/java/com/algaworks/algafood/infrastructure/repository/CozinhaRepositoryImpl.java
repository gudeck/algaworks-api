package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cozinha> list() {
        return manager.createQuery("from Cozinha", Cozinha.class).getResultList();
    }

    @Transactional
    @Override
    public Cozinha save(Cozinha cozinha) {
        return manager.merge(cozinha);
    }

    @Override
    public Cozinha findById(Long id) {
        return manager.find(Cozinha.class, id);
    }

    @Transactional
    @Override
    public Cozinha remove(Long id) {
        Cozinha cozinha = findById(id);

        if (cozinha == null) {
            throw new EmptyResultDataAccessException(1);
        }

        manager.remove(cozinha);
        return cozinha;
    }
}
