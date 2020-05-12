package com.algaworks.algafood.domain.service;

import com.algaworks.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroRestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private CozinhaRepository cozinhaRepository;

    public Restaurante save(Restaurante restaurante) throws EntidadeNaoEncontradaException {
        Long cozinhaId = restaurante.getCozinha().getId();
        Cozinha cozinha = cozinhaRepository.findById(cozinhaId);

        if (cozinha == null) {
            throw new EntidadeNaoEncontradaException(
                    String.format("Não existe cadastro de cozinha com código %d", cozinhaId)
            );
        }
        restaurante.setCozinha(cozinha);

        return restauranteRepository.save(restaurante);
    }

//    public void remove(Long restauranteId) throws EntidadeNaoEncontradaException {
//        try {
//            repository.remove(restauranteId);
//        } catch (EmptyResultDataAccessException e) {
//            throw new EntidadeNaoEncontradaException(
//                    String.format("Não existe um cadastro de cozinha com código %d", restauranteId));
//        } catch (DataIntegrityViolationException e) {
//            throw new EntidadeEmUsoException(
//                    String.format("Cozinha de código %d não pode ser removida, pois está em uso.",
//                            restauranteId)
//            );
//        }
//    }

}
