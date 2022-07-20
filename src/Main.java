import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao curso Java");
        curso.setCargaHoraria(50);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria ministrada para o curso de Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Mateus");
        dev.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos do(a) "+dev.getNome()+": "+ dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudos Inscritos do(a) "+dev.getNome()+": "+ dev.getConteudosInscritos());
        System.out.println("Conteudos Concluídos do(a) "+dev.getNome()+": "+ dev.getConteudosConcluidos());
        System.out.println("XP: "+dev.calcularTotalXp());

    }
}
