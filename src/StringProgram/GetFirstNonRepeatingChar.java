package StringProgram;

import java.util.HashMap;

public class GetFirstNonRepeatingChar {

	public static void main(String[] args) {
		System.out.println(getFirstNonRepeatingChar("aahhhdddnndfttrewjkkslz"));

	}
	
	public static Character getFirstNonRepeatingChar(String str){
		
		HashMap<Character,Integer> reqChar = new HashMap<Character,Integer>();
		
		for(int i=0; i<str.length()-1;i++){
			char c = str.charAt(i);
			if(reqChar.containsKey(c)){
				reqChar.put(c, reqChar.get(c)+1);
			}else{
				reqChar.put(c, 1);
			}
		}
		
		for(int i=0;i<str.length()-1;i++){
			char word = str.charAt(i);
			if(reqChar.get(word) == 1)
				return word;
		}
		return null;
	}

}
