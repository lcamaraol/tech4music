package com.tech4musics.tech4musics.shared;

import java.util.List;

import com.tech4musics.tech4musics.model.Musica;

public class MusicaDto {
    private List<String> erros;

    public MusicaDto(List<String> erros) {
        this.erros = erros;
    }

    public List<String> getErros() {
        return erros;
    }

    public void setErros(List<String> erros) {
        this.erros = erros;
    }

    public static Object from(Musica musica) {
        return null;
    }
}