import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        int operator;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter your choice:"+"\n"+"1.Addtion"+"\n"+"2.Subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Division"+"\n");
        operator = scanner.nextInt();

        switch (operator) {
            case 1:
                result = num1 + num2;
                System.out.println("The sum is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The difference is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The product is: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("The quotient is: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}
