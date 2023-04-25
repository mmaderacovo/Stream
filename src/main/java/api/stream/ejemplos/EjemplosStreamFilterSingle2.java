package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle2 {
    public static void main(String[] args) {

        Usuario usuario =Stream
                .of("Ana Gomez","Juan Pinto","Maira Guzman","Sara Estrada","Ana Fernandez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u ->u.getId().equals(3))
                .findFirst().orElseGet(()->new Usuario("Pilar","Estrada"));

        System.out.println(usuario);

    }
}
