import java.util.Scanner;

class DigitSum{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,j=0,k;
		System.out.print("Enter the number = ");
		number = sc.nextInt();
		System.out.print("Digit Sum of " +number+ " = ");
		int i = number;
		do
		 {
		 	k=i%10;
			j = k+j;
			// System.out.println(j);
			i/=10;
		}while(i!=0);
		System.out.println(j);
	}
}