import java.util.Scanner;

class Factorial{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,j=1;
		System.out.print("Enter the number = ");
		number = sc.nextInt();
		System.out.print(number+" Factorial = ");
		int i = 1;
		while(i <=number)
		 {
			j = j *i;
			// System.out.println(j);
			i++;
		}
		System.out.println(j);
	}
}