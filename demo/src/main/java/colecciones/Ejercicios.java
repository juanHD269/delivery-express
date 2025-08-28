package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import modelo.Pedido;

public class Ejercicios {

    // Parte A: ArrayList
    public static void usarArrayList() {
        List<Pedido> pedidos = new ArrayList<>(Arrays.asList(
                new Pedido("Juan", "Pizza", 40),
                new Pedido("Ana", "Hamburguesa", 25),
                new Pedido("Luis", "Sushi", 60),
                new Pedido("Marta", "Pizza", 45),
                new Pedido("Sofía", "Ensalada", 20)
        ));

        System.out.println("Pedidos iniciales (ArrayList):");
        pedidos.forEach(System.out::println);

        pedidos.add(0, new Pedido("Pedro", "Tacos", 30));
        pedidos.add(0, new Pedido("Laura", "Arepa", 15));

        System.out.println("Con urgentes al inicio (ArrayList):");
        pedidos.forEach(System.out::println);
    }

    // Parte A: LinkedList
    public static void usarLinkedList() {
        LinkedList<Pedido> pedidos = new LinkedList<>(Arrays.asList(
                new Pedido("Juan", "Pizza", 40),
                new Pedido("Ana", "Hamburguesa", 25),
                new Pedido("Luis", "Sushi", 60),
                new Pedido("Marta", "Pizza", 45),
                new Pedido("Sofía", "Ensalada", 20)
        ));

        System.out.println("Pedidos iniciales (LinkedList):");
        pedidos.forEach(System.out::println);

        pedidos.addFirst(new Pedido("Pedro", "Tacos", 30));
        pedidos.addFirst(new Pedido("Laura", "Arepa", 15));

        System.out.println("Con urgentes al inicio (LinkedList):");
        pedidos.forEach(System.out::println);

        System.out.println("👉 Si fueran 1000 pedidos urgentes, LinkedList es más eficiente.");
    }

    // Parte B: HashSet
    public static void usarHashSet() {
        Set<Pedido> pedidos = new HashSet<>(Arrays.asList(
                new Pedido("Juan", "Pizza", 40),
                new Pedido("Ana", "Hamburguesa", 25),
                new Pedido("Luis", "Sushi", 60),
                new Pedido("Juan", "Pizza", 40) // Duplicado
        ));

        System.out.println("Contenido del HashSet:");
        pedidos.forEach(System.out::println);

        System.out.println("👉 Los duplicados no se almacenan en un HashSet.");
    }

    // Parte C: HashMap
    public static void usarHashMap() {
        Map<String, List<Pedido>> pedidosClientes = new HashMap<>();

        pedidosClientes.put("Juan", Arrays.asList(
                new Pedido("Juan", "Pizza", 40),
                new Pedido("Juan", "Hamburguesa", 20)
        ));

        pedidosClientes.put("Ana", Arrays.asList(
                new Pedido("Ana", "Sushi", 60),
                new Pedido("Ana", "Ensalada", 25)
        ));

        pedidosClientes.put("Luis", Arrays.asList(
                new Pedido("Luis", "Pizza", 45),
                new Pedido("Luis", "Tacos", 30)
        ));

        String cliente = "Ana";
        System.out.println("Pedidos de " + cliente + ":");
        pedidosClientes.get(cliente).forEach(System.out::println);

        System.out.println("Totales por cliente:");
        pedidosClientes.forEach((c, lista) -> {
            double total = lista.stream()
                                .mapToDouble(Pedido::getPrecio)
                                .sum();
            System.out.println(c + " gastó $" + total);
        });
    }
}
