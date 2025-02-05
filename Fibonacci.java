import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner scanner = new java.util.Scanner(System.in);

        // pedir ao usuário para inserir um número
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // variáveis para armazenar os dois primeiros números da sequência
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println(" Os primeiros " + number + 
        "Fibonacci sequence: ");

        for(int i = 0; i < number; i++) {
            System.out.print(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        scanner.close();
    }
}
