import java.util.Scanner;

class Condition{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		i = sc.nextInt();
		if (i>40)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}
}