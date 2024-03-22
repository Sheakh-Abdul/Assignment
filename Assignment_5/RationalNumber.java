import java.util.Scanner;

class RationalNumberCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the first rational number:");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();

        
        System.out.println("Enter the second rational number:");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();

        
        System.out.println("Enter the arithmetic operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        
        switch (operation) {
            case '+':
                addRationalNumbers(numerator1, denominator1, numerator2, denominator2);
                break;
            case '-':
                subtractRationalNumbers(numerator1, denominator1, numerator2, denominator2);
                break;
            case '*':
                multiplyRationalNumbers(numerator1, denominator1, numerator2, denominator2);
                break;
            case '/':
                divideRationalNumbers(numerator1, denominator1, numerator2, denominator2);
                break;
            default:
                System.out.println("Invalid operation.");
        }

     
    }

    private static void addRationalNumbers(int num1, int den1, int num2, int den2) {
        int resultNum = num1 * den2 + num2 * den1;
        int resultDen = den1 * den2;
        simplifyFraction(resultNum, resultDen);
    }

    private static void subtractRationalNumbers(int num1, int den1, int num2, int den2) {
        int resultNum = num1 * den2 - num2 * den1;
        int resultDen = den1 * den2;
        simplifyFraction(resultNum, resultDen);
    }

    private static void multiplyRationalNumbers(int num1, int den1, int num2, int den2) {
        int resultNum = num1 * num2;
        int resultDen = den1 * den2;
        simplifyFraction(resultNum, resultDen);
    }

    private static void divideRationalNumbers(int num1, int den1, int num2, int den2) {
        int resultNum = num1 * den2;
        int resultDen = den1 * num2;
        simplifyFraction(resultNum, resultDen);
    }

    private static void simplifyFraction(int num, int den) {
        int gcd = gcd(num, den);
        num /= gcd;
        den /= gcd;
        System.out.println("Result: " + num + "/" + den);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
