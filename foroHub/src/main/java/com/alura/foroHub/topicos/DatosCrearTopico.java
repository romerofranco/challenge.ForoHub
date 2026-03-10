package com.alura.foroHub.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosCrearTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotBlank String autor,
        @NotBlank String curso
) {}