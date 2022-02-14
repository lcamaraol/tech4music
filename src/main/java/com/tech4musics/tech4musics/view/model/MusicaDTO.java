package com.tech4musics.tech4musics.view.model;

import com.tech4musics.tech4musics.model.Musica;

public class MusicaDTO {
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private String compositor;
    private Integer anoLancamento;

    public MusicaDTO(String titulo, String artista, String album, String genero, Integer anoLancamento, String compositor) {
        this.setTitulo(titulo);
        this.setArtista(artista);
        this.setAlbum(album);
        this.setGenero(genero);
        this.setAnoLancamento(anoLancamento);
        this.setCompositor(compositor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public static MusicaDTO from(Musica musica) {
        return new MusicaDTO(musica.getTitulo(), musica.getArtista(), musica.getAlbum(), musica.getGenero(), musica.getAnoLancamento(), musica.getCompositor());
    }
}
