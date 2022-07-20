package br.com.dio.desafio.dominio;
public class Curso {

    private String titulo;
    private String descricao;
    int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public Curso setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Curso setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Curso setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        return this;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
