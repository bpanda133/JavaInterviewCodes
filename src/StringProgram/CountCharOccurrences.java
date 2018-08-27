package StringProgram;

import java.util.HashMap;

public class CountCharOccurrences {
	
	static void GetOccurrences(String inputStr){
		HashMap<Character, Integer> CharCount = new HashMap<Character, Integer>();
		
		inputStr = inputStr.replaceAll("\\s", "");
		
		char[] strArray = inputStr.toCharArray();
		
		for(char c: strArray)
		{
			if(CharCount.containsKey(c)){
				CharCount.put(c, CharCount.get(c)+1);
			}
			else{
				CharCount.put(c, 1);
			}
		}
		System.out.println(CharCount);
	}

	public static void main(String[] args) {
		GetOccurrences("Java J2EE Java JSP J2EE");
		
		GetOccurrences("123654812365211354004580");

	}

}
