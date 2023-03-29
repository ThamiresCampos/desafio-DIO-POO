import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria de java");
    mentoria.setData(LocalDate.now());

    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setNome("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThamires = new Dev();
        devThamires.setNome("Thamires");
        devThamires.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thamires: " + devThamires.getConteudosInscritos());
        devThamires.progredir();
        devThamires.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thamires: " + devThamires.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thamires: " + devThamires.getConteudosConcluidos());
        System.out.println("xp: " + devThamires.calcularTotalXp());

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        Dev devCamilly = new Dev();
        devCamilly.setNome("Camilly");
        devCamilly.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camilly: " + devCamilly.getConteudosInscritos());
        devCamilly.progredir();
        devCamilly.progredir();
        devCamilly.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Camilly: " + devCamilly.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camilly: " + devCamilly.getConteudosConcluidos());
        System.out.println("xp: " + devCamilly.calcularTotalXp());

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        Dev devBianca = new Dev();
        devBianca.setNome("Bianca");
        devBianca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bianca: " + devBianca.getConteudosInscritos());
        devBianca.progredir();
        devBianca.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Bianca: " + devBianca.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bianca: " + devBianca.getConteudosConcluidos());
        System.out.println("xp: " + devBianca.calcularTotalXp());




    }
}
