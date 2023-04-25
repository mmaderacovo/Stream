package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistincUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Ana Gomez", "Juan Pinto", "Maira Guzman", "Sara Estrada", "Ana Fernandez","Ana Gomez","Ana Gomez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);

    }
}
