package com.tech4musics.tech4musics.model;

import java.util.List;
import com.tech4musics.tech4musics.view.model.NewMusicaDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("pessoas")
public class Musica {
    @Id
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private String compositor;
    private Integer anoLancamento;
    private List<Playlist> playlists;
    
    public Musica(String titulo, String artista, String album, String genero, Integer anoLancamento, String compositor) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.compositor = compositor;
    }

    public List<Playlist> getPlaylist() {
        return playlists;
    }

    public void setPlaylist(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public static Musica from(NewMusicaDTO dto) {
        return new Musica(dto.getTitulo(), dto.getArtista(), dto.getAlbum(), dto.getGenero(), dto.getAnoLancamento(), dto.getCompositor());
    }
}
