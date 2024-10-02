import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Please enter your age: ");
        int userAge = scanner.nextInt();
        System.out.println("Please confirm the following by saying Yes/No: \n Name: " + firstName + " " + lastName + "\n Age: " + userAge);
        String confirmation = scanner.next().toLowerCase();
        boolean isConfirmed;
        if(confirmation.equals("yes")){
            isConfirmed = true;
            // System.out.println(isConfirmed);
            System.out.println("Awesome!");
        }else if(confirmation.equals("no")){
            isConfirmed = false;
            // System.out.println(isConfirmed);
            System.out.println("Please re-enter your information!");
        }else{
            System.out.println("Please enter Yes/No: ");
        }
    }
}