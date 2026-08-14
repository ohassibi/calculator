import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // This is a calculator 
        System.out.println("Welcome!");
        System.out.println(operation());

    }
    public static double operation () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation would you like to complete today?");
        System.out.println("Type A for Addition, S for subtraction, M for multiplication, D for multiplication, E for exponent:");
        String operator = scanner.nextLine();

        String path;
        if (operator.equals("A")) {
            System.out.println("Addition it is!");
            path = "Addition";
        } else if (operator.equals("S")) {
            System.out.println("Subtraction it is!");
            path = "Subtraction";
        } else if (operator.equals("M")) {
            System.out.println("Multiplication it is!");
            path = "Multiplication";
        } else if (operator.equals("D")) {
            System.out.println("Division it is!");
            path = "Division";
        } else if (operator.equals("E")) {
            System.out.println("Exponent it is!");
            path = "Exponent";
        } else {
            System.out.println("Please try again.");
            path = "Unknown";
            return 0.0;
        }

        System.out.println("Value of the first number:");
        double a = Double.valueOf(scanner.nextLine());
        System.out.println("Value of the second number:");
        double b = Double.valueOf(scanner.nextLine());

        double value;
        if (path.equals("Addition")) {
            value = addition(a, b);
            return value;
        } else if (path.equals("Subtraction")) {
            value = subtraction(a, b);
            return value;
        } else if (path.equals("Multiplication")) {
            value = multiplication(a, b);
            return value;
        } else if (path.equals("Division")) {
            value = division(a, b);
        } else if (path.equals("Exponent")) {
            value = power(a,b);
        } else {
            System.out.println("Please run the program again and choose a valid response");
            return 0.0;
        }
        return value;

    }
    public static double addition (double a, double b) {
        return a + b;
    }
    public static double subtraction (double a, double b) { 
        return a - b;
    }
    public static double multiplication (double a, double b) {
        return a * b;
    }
    public static double division (double a, double b) {
        return a / b;
    }
    public static double power (double a, double b) {
        return Math.pow(a, b);
    }











}