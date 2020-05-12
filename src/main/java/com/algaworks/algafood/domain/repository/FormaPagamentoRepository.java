package com.algaworks.algafood.domain.repository;

import com.algaworks.algafood.domain.model.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {

    List<FormaPagamento> list();

    FormaPagamento findById(Long id);

    FormaPagamento save(FormaPagamento formaPagamento);

    void remove(FormaPagamento formaPagamento);

}
