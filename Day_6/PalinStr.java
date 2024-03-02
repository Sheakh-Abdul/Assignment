import java.util.*;
class PalinStr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		String str1 = new String();
		String subStr = new String();
		System.out.println("Enter Your String:");
		str = sc.nextLine();
		sc.close();
		str =str + '\0';//hello0
		int i=0,j=0;
		while(str.charAt(i)!= '\0'){

			i++;
		}
		i--;
		while(i>=0){
			subStr = subStr + str.charAt(i);
			str1 = str1 + str.charAt(j);
			i--;
			j++;
		}
		// System.out.println(str);
		// System.out.println(subStr);
		System.out.print(str1.equals(subStr));

	}
	
}