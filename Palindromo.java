import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        // criar um objeto Scanner
        Scanner scanner = new java.util.Scanner(System.in);

        // pedir ao usuário para inserir uma palavra
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        // variável para armazenar a palavra invertida
        String reversedWord = "";

        // inverter a palavra
        for(int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        // verificar se a palavra é um palíndromo
        if(word.equalsIgnoreCase(reversedWord)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

        scanner.close();
    }
}
