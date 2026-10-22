import java.util.*;
import java.util.stream.*;

public class Problema2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(9, 10, 3, 4, 7, 3, 4));

        ArrayList<Integer> patrate = lista.stream()
                .distinct()
                .map(n -> n * n)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Pătrate distincte: " + patrate);
    }
}
