package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate data;

    public String getTitulo() {
        return titulo;
    }

    public Mentoria setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Mentoria setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public LocalDate getData() {
        return data;
    }

    public Mentoria setData(LocalDate data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
