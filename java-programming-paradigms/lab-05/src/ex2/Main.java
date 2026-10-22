package ex2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String fileName = "outrand.txt";

        try (FileWriter writer = new FileWriter(fileName)) {

            Random rand = new Random();

            for (int i = 0; i < 5; i++) {
                String[] words = new String[10];

                for (int j = 0; j < 10; j++) {
                    words[j] = generateRandomWord(rand);
                }

                Arrays.sort(words);

                for (int j = 0; j < 10; j++) {
                    writer.write(words[j]);
                    if (j < 9) {
                        writer.write(" ");
                    }
                }
                writer.write("\n");
            }

            System.out.println("Fișierul a fost generat cu succes!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateRandomWord(Random rand) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char letter = (char) ('a' + rand.nextInt(26));
            word.append(letter);
        }
        return word.toString();
    }
}
