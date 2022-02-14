package com.tech4musics.tech4musics.service;

import java.util.List;
import java.util.Optional;

import com.tech4musics.tech4musics.model.Musica;
import com.tech4musics.tech4musics.model.Playlist;
import com.tech4musics.tech4musics.repository.MusicaRepository;
import com.tech4musics.tech4musics.view.model.MusicaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository repositorio;

    public Musica salvar(Musica playlist) {
        return repositorio.save(playlist);
    }

    public List<Musica> obterTodos() {
        return repositorio.findAll();
    }

        public Optional<Musica> obterPorGenero(String genero) {
        return repositorio.findByGenero(genero);
    }
}
