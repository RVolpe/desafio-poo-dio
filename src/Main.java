import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Treinamento de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Treinamento de Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo Volpe");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());

        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());

        System.out.println("--------");
        Dev devTiago = new Dev();
        devTiago.setNome("Tiago XYZ");
        devTiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Tiago: " + devTiago.getConteudosInscritos());

        devTiago.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Tiago: " + devTiago.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Tiago: " + devTiago.getConteudosConcluidos());
        System.out.println("XP: " + devTiago.calcularTotalXp());
    }
}
