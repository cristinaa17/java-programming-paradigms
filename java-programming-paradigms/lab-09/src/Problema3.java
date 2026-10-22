import java.util.*;
import java.util.stream.*;

public class Problema3 {
    public static void main(String[] args) {
        String text = "Acesta este un program scris cu java 8 si expresii lambda";
        List<String> cuvinte = Arrays.asList(text.split(" "));

        List<String> lungimeMin5 = cuvinte.stream()
                .filter(cuv -> cuv.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Cuvinte cu lungimea >= 5: " + lungimeMin5);
        System.out.println("Număr: " + lungimeMin5.size());

        List<String> ordonata = lungimeMin5.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Listă ordonată: " + ordonata);

        ordonata.stream()
                .filter(cuv -> cuv.startsWith("p"))
                .findFirst()
                .ifPresent(cuv -> System.out.println("Cuvânt cu 'p': " + cuv));
    }
}