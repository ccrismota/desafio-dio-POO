import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setCargaHoraria(40);
        curso.setDescricao("Java POO");

        Curso curso1 = new Curso();
        curso1.setTitulo("Javascrpt");
        curso1.setCargaHoraria(10);
        curso1.setDescricao("Javascrpt vanilha");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria bootcamp");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
    }
}