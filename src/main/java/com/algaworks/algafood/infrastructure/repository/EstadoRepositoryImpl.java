package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Estado> list() {
        return manager.createQuery("from Estado", Estado.class).getResultList();
    }

    @Transactional
    @Override
    public Estado save(Estado estado) {
        return manager.merge(estado);
    }

    @Override
    public Estado findById(Long id) {
        return manager.find(Estado.class, id);
    }

    @Transactional
    @Override
    public void remove(Estado estado) {
        estado = findById(estado.getId());
        manager.remove(estado);
    }
}
