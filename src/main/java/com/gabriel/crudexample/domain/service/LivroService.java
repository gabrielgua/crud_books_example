package com.gabriel.crudexample.domain.service;

import com.gabriel.crudexample.domain.model.Livro;
import com.gabriel.crudexample.domain.repository.LivroRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class LivroService {

    private LivroRepository repository;

    @Transactional(readOnly = true)
    public List<Livro> listAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Livro findById(Long livroId) {
        return repository.findById(livroId).orElseThrow();
    }

    @Transactional
    public Livro save(Livro livro) {
        return repository.save(livro);
    }

    @Transactional
    public void delete(Livro livro) {
        repository.delete(livro);
    }
}
