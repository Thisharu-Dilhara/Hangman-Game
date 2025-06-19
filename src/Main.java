import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String word = "pizza";

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for(int i=0; i<word.length(); i++){
            wordState.add('_');
        }
        System.out.println("************************");
        System.out.println("Welcome to java hangman");
        System.out.println("************************");





        scanner.close();
    }
    static String getHangmanArt(int wrongGuess){

        return switch (wrongGuess){
            case 0 -> """
                      
                      
                      
                      """;
            case 1 -> """
                      o
                      
                      
                      """;
            case 2 -> """
                      o
                      |
                      
                      """;
            case 3 -> """
                      o
                     /|
                     
                      """;
            case 4 -> """
                      o
                     /|\\
                     
                      """;
            case 5 -> """
                      o
                     /|\\
                     /
                      """;
            case 6 -> """
                      o
                     /|\\
                     / \\
                      """;
            default -> "";

        };


    }
}