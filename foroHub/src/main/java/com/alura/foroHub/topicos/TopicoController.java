package com.alura.foroHub.topicos;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaTopico> registrarTopico(
            @RequestBody @Valid DatosCrearTopico datos,
            UriComponentsBuilder uriComponentsBuilder) {

        Topico topico = new Topico(datos);
        topicoRepository.save(topico);

        URI url = uriComponentsBuilder.path("/topicos/{id}")
                .buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(url).body(new DatosRespuestaTopico(topico));
    }
}