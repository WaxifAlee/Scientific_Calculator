import java.lang.Math;
import java.util.Scanner;

public class Assignment_Calculator {

    // Defining Functions Of Simple Calculator

    public static double sum(double n1, double n2) {
        return n1 + n2;
    }

    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public static double divide(double n1, double n2) {
        return n1 / n2;
    }

    public static double subtract(double n1, double n2) {
        return n1 - n2;
    }

    // Defining Functions for the scientific caluclator

    public static double pow(double b, double n2) {
        double pow = 1;
        for (int i = 1; i <= n2; i++) {
            pow *= b;
        }

        return pow;
    }

    public static double sqr(double n) {
        return n * n;
    }

    public static double cube(double n) {
        return n * n * n;
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Please Choose The Calculator");
        System.out.println("1. Simple\n2. Scientific\n0. Quit Program");

        Scanner sc = new Scanner(System.in);

        System.out.print(">>> ");
        byte calc = sc.nextByte();

        boolean simpleCalc = calc == 1 ? true : false;

        if (calc == 0) {
            System.out.println("Goodbye! :)");
        }

        else if (simpleCalc) {
            System.out.println(
                    "Please Choose Among The Available Operations\n" +
                            "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.print(">>> ");
            byte opr = sc.nextByte();
            System.out.print("Enter The First Number: ");
            int n1 = sc.nextInt();
            System.out.print("Enter the Second Number: ");
            int n2 = sc.nextInt();

            switch (opr) {
                case 1:
                    System.out.println(sum(n1, n2));
                    break;
                case 2:
                    System.out.println(subtract(n1, n2));
                    break;
                case 3:
                    System.out.println(multiply(n1, n2));
                    break;
                case 4:
                    System.out.println(divide(n1, n2));
                    break;
                default:
                    System.out.println("Please Select a Valid Operator");
                    break;
            }
        }

        else if (!simpleCalc) {
            System.out.println("Please Choose Among The Available Operations\n" +
                    "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n" +
                    "5. Sin\n" + "6. Cos\n" + "7. Tan\n" + "8. Square\n" + "9. nth Power\n" + "10. Cube\n" +
                    "11. Square Root\n" + "12. Factorial \n" + "0. Quit");
            byte ope = sc.nextByte();

            boolean singleDigitBased = ope == 5 || ope == 6 || ope == 7 || ope == 8 || ope == 10 || ope == 11
                    || ope == 12;

            if (!singleDigitBased) {
                System.out.print("Enter first value: ");
                double n1 = sc.nextDouble();
                System.out.println("Enter the second value: ");
                double n2 = sc.nextDouble();

                switch (ope) {
                    case 1:
                        System.out.println(sum(n1, n2));
                        break;
                    case 2:
                        System.out.println(subtract(n1, n2));
                        break;
                    case 3:
                        System.out.println(multiply(n1, n2));
                        break;
                    case 4:
                        System.out.println(divide(n1, n2));
                        break;
                    case 9:
                        System.out.println(pow(n1, n2));
                    case 0:
                        System.out.println("Goodbye!");
                    default:
                        break;
                }

            }

            else {

                System.out.print("Enter the value:");
                double a = sc.nextDouble();

                switch (ope) {
                    case 5:
                        System.out.println(Math.sin(a));
                        break;
                    case 6:
                        System.out.println(Math.cos(a));
                        break;
                    case 7:
                        System.out.println(Math.tan(a));
                        break;
                    case 8:
                        System.out.println(sqr(a));
                        break;
                    case 10:
                        System.out.println(cube(a));
                        break;
                    case 11:
                        System.out.println(Math.sqrt(a));
                        break;
                    case 12:
                        System.out.println(factorial((int) a));
                        break;
                    case 0:
                        System.out.println("Good Bye!");
                        break;
                    default:
                        System.out.println("Select A Valid Operation");
                        break;
                }

            }

        }

    }
}