package StringProgram;

public class GetMissingNumInArray {
	
	static int SumOfNum(int num){
		int sum = (num* (num+1)) / 2;
		return sum;
	}
	
	static int SumOfElements(int[] array)
	{
		int sum =0;
		for(int i=0; i<array.length; i++){
			sum = sum+array[i];
		}
		
		return sum;
	}
	
	static void GetMissingNum(int num, int[] array)
	{
		int missingNum = SumOfNum(num) - SumOfElements(array);
		
		System.out.println("The Missing Num is: "+ missingNum);
	}
	

	public static void main(String[] args) {
		int n = 8;
		 int[] a = {1, 2, 4, 3, 7, 8, 6};
		 
		 GetMissingNum(n,a);

	}

}
