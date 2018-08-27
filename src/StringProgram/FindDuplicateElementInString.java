package StringProgram;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateElementInString {
	
	static void findDuplicateElement(String inputStr){
		
		inputStr = inputStr.replaceAll("\\s", "");
		
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		char[] charArray = inputStr.toCharArray();
		
		for(char c: charArray){
			if(charCount.containsKey(c)){
				charCount.put(c, charCount.get(c)+1);
			}else{
				charCount.put(c, 1);
			}
		}
		
		Set<Character> CharInString = charCount.keySet();
		
		for(Character ch: CharInString)
		{
			if(charCount.get(ch)>1)
			{
				System.out.println(ch + ":" + charCount.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		
		findDuplicateElement("JavaJ2EE");
		findDuplicateElement("Fresh Fish");

	}

}
