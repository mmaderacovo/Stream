package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosEtreamMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres=Stream
                .of("Ana Gomez","Juan Pinto","Maira Guzman","Sara Estrada")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista =nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }
}
