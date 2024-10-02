import java.util.Scanner;

public class Calculator {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Please specify which of these arithmetic operations you want to do: +, -, *, /.");
        String typeOfOperation = scanner.next();
        if(typeOfOperation.equals("+")){
            double sum = firstNumber + secondNumber;
            System.out.println("The sum is: " + sum);
        }else if(typeOfOperation.equals("-")){
            double difference = firstNumber - secondNumber;
            System.out.println("The difference is: " + difference);
        }else if(typeOfOperation.equals("*")){
            double product = firstNumber * secondNumber;
            System.out.println("The product is: " + product);
        }else if(typeOfOperation.equals("/")){
            double division = firstNumber / secondNumber;
            System.out.println("The division is: " + division);
        }
    }
}
