package StringProgram;

public class GetSecondLargestNum {
	
	static int secondLargest(int[] input){
		int largest, secondLargest;
		
		if(input[0] > input[1]){
			largest = input[0];
			secondLargest = input[1];
		}else{
			largest = input[1];
			secondLargest = input[0];
		}
		
		for(int i=2; i<input.length; i++){
			if(input[i] > largest){
				secondLargest = largest;
				largest = input[i];
			}
			else if(input[i] < largest && input[i] > secondLargest){
				secondLargest = input[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		
		System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));
		 
        System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));

	}

}
