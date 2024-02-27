package com.gabriel.crudexample.api.assembler;

import com.gabriel.crudexample.api.model.LivroModel;
import com.gabriel.crudexample.api.model.LivroRequest;
import com.gabriel.crudexample.domain.model.Livro;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LivroAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public LivroModel toModel(Livro livro) {
        return modelMapper.map(livro, LivroModel.class);
    }

    public List<LivroModel> toCollectionModel(List<Livro> livros) {
        return livros.stream()
                .map(this::toModel)
                .toList();
    }

    public Livro toEntity(LivroRequest request) {
        return modelMapper.map(request, Livro.class);
    }

    public void copyToEntity(LivroRequest request, Livro livro) {
        modelMapper.map(request, livro);
    }
}
























