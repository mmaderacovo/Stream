package api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemplosStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Ana Gomez", "Juan Pinto", "Maira Guzman", "Sara Estrada", "Ana Fernandez",
                        "Juan Pinto","Juan Pinto","Juan Pinto")
                .distinct();

                String resultado = nombres.reduce("",(a, b)-> a +", "+ b);
        System.out.println("resultado = " + resultado);

    }
}
