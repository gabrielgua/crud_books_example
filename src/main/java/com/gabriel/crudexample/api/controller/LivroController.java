package com.gabriel.crudexample.api.controller;

import com.gabriel.crudexample.api.assembler.LivroAssembler;
import com.gabriel.crudexample.api.model.LivroModel;
import com.gabriel.crudexample.api.model.LivroRequest;
import com.gabriel.crudexample.domain.service.LivroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/livros")
public class LivroController {

    private LivroService service;
    private LivroAssembler assembler;


    @GetMapping
    public List<LivroModel> listarTodos() {
        return assembler.toCollectionModel(service.listAll());
    }

    @GetMapping("/{livroId}")
    public LivroModel buscarPorId(@PathVariable Long livroId) {
        return assembler.toModel(service.findById(livroId));
    }

    @PostMapping
    public LivroModel adicionar(@RequestBody LivroRequest request) {
        var livro = assembler.toEntity(request);
        return assembler.toModel(service.save(livro));
    }

    @PutMapping("/{livroId}")
    public LivroModel editar(@PathVariable Long livroId, @RequestBody LivroRequest request) {
        var livro = service.findById(livroId);
        assembler.copyToEntity(request, livro);
        return assembler.toModel(service.save(livro));
    }

    @DeleteMapping("/{livroId}")
    public void remover(@PathVariable Long livroId) {
        var livro = service.findById(livroId);
        service.delete(livro);
    }



}
