package com.gabriel.crudexample.api.model;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class LivroModel {

    private Long id;
    private String nome;
    private String autor;
    private OffsetDateTime dataLancamento;

}
