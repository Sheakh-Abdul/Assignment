import java.util.*;

class  ConditionalOperatorExample{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		int z= (a>b)?a:b;
		System.out.println("Larger number: "+z);
	}
}