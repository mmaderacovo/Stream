package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFlatMap {
    public static void main(String[] args) {

        Stream<Usuario> nombres=Stream
                .of("Ana Gomez","Juan Pinto","Maira Guzman","Sara Estrada","Ana Fernandez")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(u->{
                    if (u.getNombre().equals("Juan")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        //nombres.forEach(System.out::println);
        System.out.println(nombres.count());

    }
}
