package colecciones;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Utilidades {
    public static <T> List<T> filtrar(List<T> lista, Predicate<T> criterio) {
        return lista.stream()
                    .filter(criterio)
                    .collect(Collectors.toList());
    }
}