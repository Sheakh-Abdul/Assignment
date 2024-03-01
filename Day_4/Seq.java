import java.util.Scanner;

class Seq{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,t,sum=0;
		for (i=1; i<n; i++){
			t = 2*(i-1);
			if (t%3==0)
				//System.out.println(t);
				sum =sum+ t;
		}
		System.out.println(sum);

	}
}