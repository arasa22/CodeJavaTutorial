import java.util.Scanner;
public class CalToNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu : ");
        System.out.println("1. +");
        System.out.println("2. *");
        System.out.println("3. /");
        System.out.println("4. -");
        System.out.print("Please chose (1-4): ");
        
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("Total is : " + result);
                break;
            case 2:
                result = number1 * number2;
                System.out.println("Total is: " + result);
                break;
            case 3:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Total is: " + result);
                } else {
                    System.out.println("Not found");
                }
                break;
            case 4:
                result = number1 - number2;
                System.out.println("Total is: " + result);
                break;
            default:
                System.out.println("choose the wrong menu!");
                break;
        }

        scanner.close();
    }
}
