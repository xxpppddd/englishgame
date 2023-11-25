package Hangman;

import Quiz.Question;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    private ArrayList<String> words;


    public Words() throws FileNotFoundException {
        words = new ArrayList<>();
        File file = new File("hangmanwords.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            words.add(word);
        }
    }

    public String getRandomWord() {
        int randomIndex = (int) (Math.random() * words.size());
        return words.get(randomIndex).toUpperCase();
    }

}
