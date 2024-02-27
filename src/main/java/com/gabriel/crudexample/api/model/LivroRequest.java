package com.gabriel.crudexample.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
public class LivroRequest {

    @NotBlank
    private String nome;

    @NotBlank
    private String autor;

    @NotNull
    private OffsetDateTime dataLancamento;
}
