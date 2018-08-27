package StringProgram;

public class ValidateArmstrongNum {
	
	static void validateArmstrongNum(int num){
		int temp = num;
		int sum =0;
		
		int noOfDigit = String.valueOf(num).length();
		
		while(temp != 0){
			int last = temp %10;
			int powerOfDigit = 1;
			
			for(int i=0; i<noOfDigit ; i++){
				powerOfDigit = powerOfDigit * last;
			}
			sum = sum + powerOfDigit;
			temp = temp/10;
		}
		
		if(sum == num)
			System.out.println(num + " is an Armstrong Number.");
		else
			System.out.println(num + " is not an Armstrong Number.");
		
	}

	public static void main(String[] args) {
		validateArmstrongNum(153);
		
		validateArmstrongNum(9474);
		
		validateArmstrongNum(54748);
		
		validateArmstrongNum(4630);

	}

}
