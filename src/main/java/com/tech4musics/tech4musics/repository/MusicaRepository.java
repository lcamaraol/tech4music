package com.tech4musics.tech4musics.repository;

import java.util.Optional;

import com.tech4musics.tech4musics.model.Musica;
import com.tech4musics.tech4musics.model.Playlist;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicaRepository extends MongoRepository<Playlist, String> {

    Optional<Musica> findByGenero(String genero);

    Musica save(Musica playlist);
    
}
