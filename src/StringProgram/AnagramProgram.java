package StringProgram;

import java.util.Arrays;

public class AnagramProgram {
	
	
	//Using sort() and equals() method.
	static void isAnagram(String s1, String s2){
		String copyOfS1 = s1.replaceAll("\\s", "");//This line will remove all white space in the string.
		String copyOfS2 = s2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(copyOfS1.length() != copyOfS2.length())
		{
			status = false;
		}
		else{
			char[] s1Array = copyOfS1.toLowerCase().toCharArray();
			char[] s2Array = copyOfS2.toLowerCase().toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			status = Arrays.equals(s1Array, s2Array);
		}
		
		if(status)
		{
			System.out.println(s1 +" and "+s2+" Strings are anagram");
		}else{
			System.out.println(s1 +" and "+s2+" Strings are not anagram");
		}
	}
	
	
	//Using String Builder 
	static void IsAnagramUsingStringBuilder(String s1, String s2){
		String copyOfS1 = s1.replaceAll("\\s", "");
		String copyOfS2 = s2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(copyOfS1.length() != copyOfS2.length()){
			status = false;
		}
		else{
			char[] s1Array = copyOfS1.toLowerCase().toCharArray();
			
			StringBuilder sb = new StringBuilder(copyOfS2);
			
			for(char c : s1Array){
				int index = sb.indexOf(""+c);
				
				if(index != -1)
				{
					sb.deleteCharAt(index);
				}else{
					status = false;
					break;
				}
			}
		}
		
		if(status)
		{
			System.out.println(s1 +" and "+s2+" Strings are anagram");
		}else{
			System.out.println(s1 +" and "+s2+" Strings are not anagram");
		}
	}
	
	public static void main(String args[]){
		//isAnagram("Stop", "Post");
		//isAnagram("Mother In Law", "Hitler Woman");
		
		IsAnagramUsingStringBuilder("Stop", "Post");
		IsAnagramUsingStringBuilder("Mother In Law", "Hitler Woman");
	}

}
