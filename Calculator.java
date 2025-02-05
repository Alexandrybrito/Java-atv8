import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // pedir ao usuário para inserir dois números e um operador
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // variavel para armazenar o resultado
        double result = 0;

        // realizar a operação baseada no operador
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }

        // exibir o resultado
        System.out.println("The result is: " + result);

        scanner.close();
    
    }
}
