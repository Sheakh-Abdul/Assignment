import java.util.*;

class Calculator {
	public static void main(String[] args) {
		int i,n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Simple Calculator");
		System.out.println("-----------------");

		System.out.print("Enter First Number: ");
		n = sc.nextInt();

		System.out.print("Enter Second Number: ");
		m = sc.nextInt();

		System.out.println("\nChoose an operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		System.out.print("Enter your choice: ");
		i = sc.nextInt();
		switch (i){

		case 3:
			System.out.println("\nResult:"+ n +" * "+ m+ " = "+(m*n));
			break;


		case 1:
			System.out.println("\nResult:"+ n +" + "+ m+ " = "+(m+n));
			break;

		case 2:
			System.out.println("\nResult:"+ n +" - "+ m+ " = "+(n-m));
			break;

		case 4:
			System.out.println("\nResult:"+ n +" / "+ m+ " = "+(n/m));
			break;
		
		default:
			System.out.println("\nPlease Select the Valid Operation (1-4)");
			break;

}
}
}