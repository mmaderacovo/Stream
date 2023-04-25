package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Ana Gomez", "Juan Pinto", "Maira Guzman", "Sara Estrada", "Ana Fernandez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Ana"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuario("Lola","Pinto")).getNombre());
        //System.out.println(usuario.orElseGet(()-> new Usuario("Lola","Pinto")).getNombre());
        if (usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontro el objeto");
        }
    }
}
