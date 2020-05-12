package com.algaworks.algafood.infrastructure.repository;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<FormaPagamento> list() {
        return manager.createQuery("from FormaPagamento", FormaPagamento.class).getResultList();
    }

    @Transactional
    @Override
    public FormaPagamento save(FormaPagamento formaPagamento) {
        return manager.merge(formaPagamento);
    }

    @Override
    public FormaPagamento findById(Long id) {
        return manager.find(FormaPagamento.class, id);
    }

    @Transactional
    @Override
    public void remove(FormaPagamento formaPagamento) {
        formaPagamento = findById(formaPagamento.getId());
        manager.remove(formaPagamento);
    }
}
