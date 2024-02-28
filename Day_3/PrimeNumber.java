import java.util.Scanner;

class PrimeNum{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,i,s=0;
		System.out.print("Enter the number = ");
		number = sc.nextInt();
		//System.out.println(number+" Table");
		for ( i = 2;i <number ; i++ ) {
			if (number%i == 0){
				s=1;
			}
			
		}
		if (s==1)
		System.out.println("Number is not Prime");
		else
		System.out.println("Number is a Prime");
	}
}