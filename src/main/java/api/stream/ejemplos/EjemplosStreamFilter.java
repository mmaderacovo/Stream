package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamFilter {
    public static void main(String[] args) {

        Stream<Usuario> nombres=Stream
                .of("Ana Gomez","Juan Pinto","Maira Guzman","Sara Estrada","Ana Fernandez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u ->u.getNombre().equals("Ana"))
                .peek(System.out::println);

        List<Usuario> lista =nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }
}
