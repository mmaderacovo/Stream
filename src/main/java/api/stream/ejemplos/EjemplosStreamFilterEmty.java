package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilterEmty {
    public static void main(String[] args) {

        Long count = Stream
                .of("", "Juan Pinto", "", "Sara Estrada", "Ana Fernandez")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);

    }
}
