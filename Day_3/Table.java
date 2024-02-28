import java.util.Scanner;

class Table{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,i;
		System.out.print("Enter the number = ");
		number = sc.nextInt();
		System.out.println(number+" Table");
		for ( i = 1;i <11 ; i++ ) {
			System.out.println(number+" x "+ i+" = "+ (i*number));
		}
	}
}