package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterCount {
    public static void main(String[] args) {

        long count =Stream
                .of("Ana Gomez","Juan Pinto","Maira Guzman","Sara Estrada","Ana Fernandez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();

        System.out.println(count);

    }
}
