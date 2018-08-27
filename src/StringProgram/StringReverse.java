package StringProgram;

public class StringReverse {

	public static void main(String[] args) {
		String str = "MyJava";
		
		char[] strArray = str.toCharArray();
		
		for(int i=strArray.length-1; i >=0 ; i--){
			System.out.println(strArray[i]);
		}

	}

}
