package api.stream.ejemplos;

import api.stream.ejemplos.models.Factura;
import api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1= new Usuario("Juan","Gomez");
        Usuario u2= new Usuario("Laury","Rueda");
        Usuario u3= new Usuario("Mafe","Mendez");


        u1.addFactura(new Factura("Compras Teconlogia"));
        u1.addFactura(new Factura("Compra muebles"));

        u2.addFactura(new Factura("Compra zapatos"));
        u2.addFactura(new Factura("Compra notebook"));

        u3.addFactura(new Factura("Compra ropa"));
        u3.addFactura(new Factura("Compra carro"));

        List<Usuario> usuarios = Arrays.asList(u1,u2,u3);
        usuarios.stream()
                .flatMap(u-> u.getFacturas().stream())
                .forEach(f-> System.out.println(f.getDescripcion().concat(" : Cliente "
                        .concat(f.getUsuario().toString()))));

        /*for (Usuario u: usuarios) {
            for (Factura f: u.getFacturas()) {
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
