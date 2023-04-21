package api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemplosEtream {
    public static void main(String[] args) {

        //Stream<String> nombres=Stream.of("Ana","Juan","Maira","Sara");
        //nombres.forEach(System.out::println);

        //String[] arr ={"Ana","Juan","Maira","Sara"};
       //Stream<String> nombres = Arrays.stream(arr);
        //nombres.forEach(System.out::println);

        /*Stream<String> nombres = Stream.<String>builder()
                .add("Ana")
                .add("Juan")
                .add("Maira")
                .add("Sara")
                .build();
        nombres.forEach(System.out::println);*/

        List<String> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add("Juan");
        lista.add("Maira");
        lista.add("Sara");

        Stream<String> nombres = lista.stream();
        nombres.forEach(System.out::println);
        System.out.println();

        lista.stream().forEach(System.out::println);
    }
}
