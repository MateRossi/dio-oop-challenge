package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public Bootcamp setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Bootcamp setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public Bootcamp setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    public Bootcamp setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;
        return this;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public Bootcamp setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicio, bootcamp.dataInicio) && Objects.equals(dataFim, bootcamp.dataFim) && Objects.equals(devsIncritos, bootcamp.devsIncritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicio, dataFim, devsIncritos, conteudos);
    }
}
