class MinMax{
	public static void main(String[] args) {

		int array [] = {5,4,3,9,1,7,9};
		int min,max;
		max = array[0];
		min = max;
		for (int i=0; i< array.length; i++){
			if (min > array[i])
				min = array[i];
			else if (max < array[i])
				max = array[i];

		}
		System.out.println("Min: "+min);
		
		System.out.println("Max: " +max);
	}
}