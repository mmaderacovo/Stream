package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStreamDistincUsuarioSum {
    public static void main(String[] args) {

        IntStream longNombres = Stream
                .of("Ana Gomez", "Juan Pinto", "Maira Guzman", "Sara Estrada", "Ana Fernandez","Ana Gomez","Ana Gomez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        //longNombres.forEach(System.out::println);
        IntSummaryStatistics stats = longNombres.summaryStatistics();
        System.out.println("Total = "+ stats.getSum());
        System.out.println("Max = " +stats.getMax());
        System.out.println("Min = "+stats.getMin());
        System.out.println("Promedio = "+ stats.getAverage());
        System.out.println("Contar = "+ stats.getCount());

    }
}
