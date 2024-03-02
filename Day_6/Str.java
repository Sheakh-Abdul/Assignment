import java.util.*;
class Revstr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter Your String:");
		str = sc.nextLine();
		sc.close();
		str =str + '\0';//hello0
		int i=0;
		while(str.charAt(i)!= '\0'){

			i++;
		}
		i--;
		while(i>=0){
			System.out.print(str.charAt(i));
			i--;
		}
	}
	
}