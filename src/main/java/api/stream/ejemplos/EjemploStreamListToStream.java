package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Camilo","Perez"));
        lista.add(new Usuario("Diana","Lopez"));
        lista.add(new Usuario("Juan","Gomez"));
        lista.add(new Usuario("Laury","Rueda"));
        lista.add(new Usuario("Mafe","Mendez"));
        lista.add(new Usuario("Manuel","Acevedo"));
        lista.add(new Usuario("Rey","Rangel"));
        lista.add(new Usuario("Rey","Monsalve"));

        Stream<String>nombres = lista.stream()
                .map(u-> u.getNombre().toUpperCase()
                .concat(" ")
                .concat(u.getApellido()).toUpperCase())
                .flatMap(nombre ->{
                    if (nombre.contains("rey".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
        System.out.println(nombres.count());
    }
}
