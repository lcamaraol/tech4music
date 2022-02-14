package com.tech4musics.tech4musics.service;

import java.util.List;
import java.util.Optional;

import com.tech4musics.tech4musics.model.Musica;
import com.tech4musics.tech4musics.repository.MusicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository repositorio;

    public Musica salvar(Musica playlist) {
        return repositorio.save(playlist);
    }


        public Optional<Musica> obterPorGenero(String genero) {
        return repositorio.findByGenero(genero);
    }

        public List<Musica> obterTodos() {
            return null;
        }
}
