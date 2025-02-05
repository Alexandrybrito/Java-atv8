public class NumberInvert {
    
    public static void main(String[] args) {
        // criar um objeto Scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // pedir ao usuário para inserir um número
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // variável para armazenar o número invertido
        int reversedNumber = 0;

        // inverter o número
        while(number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("The inverted number is: " + reversedNumber);

        scanner.close();
    }

}
