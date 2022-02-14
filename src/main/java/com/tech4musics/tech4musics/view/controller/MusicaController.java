package com.tech4musics.tech4musics.view.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import com.tech4musics.tech4musics.model.Musica;
import com.tech4musics.tech4musics.service.MusicaService;
import com.tech4musics.tech4musics.view.model.MusicaDTO;
import com.tech4musics.tech4musics.view.model.NewMusicaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/musicas")
public class MusicaController {
    @Autowired
    private MusicaService servico;

    @PostMapping
    public ResponseEntity<NewMusicaDTO> criar(@RequestBody @Valid NewMusicaDTO dto) {
        Musica musica = Musica.from(dto);
        Musica musicaSalva = servico.salvar(musica);
        NewMusicaDTO dtoResponse = NewMusicaDTO.from(musicaSalva);
        return new ResponseEntity<>(dtoResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<MusicaDTO>> obterTodos() {
        List<Musica> musicas = servico.obterTodos();

        List<MusicaDTO> dtos = musicas
            .stream()
            .map(MusicaDTO::from)
            .collect(Collectors.toList());

        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping("/{genero}")
    public ResponseEntity<MusicaDTO> obterPorGenero(@PathVariable String genero) {
        Optional<Musica> optional = servico.obterPorGenero(genero);

        if (optional.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        var dto = MusicaDTO.from(optional.get());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
