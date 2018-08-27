package StringProgram;

import java.util.HashSet;

public class FindDuplicateElementInArray {
	
	//We used Hash set here becoz hash set only accepts unique value. If any value are duplicate then we will disply that.
	static void FindDuplicate(String[] strArray){
		
		HashSet<String> set = new HashSet<String>();
		
		for(String arrayElement : strArray){
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is: "+ arrayElement);
			}
		}
	}

	public static void main(String[] args) {
		 String[] str = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		FindDuplicate(str);

	}

}
