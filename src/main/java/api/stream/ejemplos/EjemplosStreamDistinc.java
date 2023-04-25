package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistinc {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Ana Gomez", "Juan Pinto", "Maira Guzman", "Sara Estrada", "Ana Fernandez",
                        "Juan Pinto","Juan Pinto","Juan Pinto")
                .distinct();

                nombres.forEach(System.out::println);

    }
}
