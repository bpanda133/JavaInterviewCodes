package Assignment;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;


public class StringSplitter
{
	ArrayList<String> reqChar = new ArrayList<String>();
	
	public StringSplitter(Separator...separ){
		for(Separator f : separ){
			reqChar.add(f.getValue());
		}
	}
	
	/**
	 * Splits the given string based on the separator(s) given at
	 * in the constructor.
	 * @param string String to be split
	 * @return Resulting list of substrings.
	 */
	
	public String[] split(String str){
		String[] reqStr = reqChar.toArray(new String[0]);
		String regex = Arrays.toString(reqStr);
		String[] t = str.split(regex);
		
		return t;
		
	}
	
	@Test
	public void TestMethod(){
		System.out.println("Hello world");
	}
	
	
	
}

