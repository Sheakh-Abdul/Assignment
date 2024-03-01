import java.util.Scanner;

class AryCom{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		boolean k = false; 
		int a[][]= new int[10][10];
		int b[][]= new int[10][10];
		
		System.out.println("\nEnter 1st Array Element\n");
		for (i=0; i<3; i++){
			for (int j =0; j<3;j++){
			
			a[i][j]= sc.nextInt();
		}
		}
		System.out.println("\nEnter 2nd Array Elements\n");
		for (i=0; i<3; i++){
			for (int j =0; j<3;j++){
			
			b[i][j]= sc.nextInt();
		}
		}
		for (i=0; i<3; i++){
			for (int j =0; j<3;j++){
			
			if(a[i][j] != b[i][j]){
				k=true;
				break;
			}
		}
	}
		if (k)
			System.out.println("\nMatrices are not equal");
		else
			System.out.println("\nMatrices are equal");
	}
}