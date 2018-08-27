package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {
	
	static void removeDuplicates(String[] arrayWithDuplicates){
		System.out.println("Array with Duplicate: ");
		
		for(int i=0; i <arrayWithDuplicates.length; i++){
			System.out.println(arrayWithDuplicates[i]+ "\t");
		}
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(int i=0 ; i < arrayWithDuplicates.length; i++){
			set.add(arrayWithDuplicates[i]);
		}
		
		Object[] arrayWithoutDuplicates = set.toArray();
		
		System.out.println("Array without Duplicates: ");
		
		for(int i=0; i < arrayWithoutDuplicates.length; i++){
			System.out.println(arrayWithoutDuplicates[i]+"\t");
		}
	}

	public static void main(String[] args) {
		removeDuplicates(new String[] {"4", "3", "2", "4", "9", "2"});

	}

}
