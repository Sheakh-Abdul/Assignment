class AryAvg{
	public static void main(String[] args) {

		int array [] = {5,4,3,9,1,7,9};
		  double avg,sum=0;
		for (int i=0; i< array.length; i++){
			sum =sum+ array[i];
			System.out.println(array[i]);

		}
		System.out.println(sum);
		avg= sum/7;
		System.out.println("Average:" +avg);
	}
}