package Assignment;

import java.util.HashMap;

public enum Separator
{
	Period("\\."),
	Hash("#"),
	Comma("\\,");

	private String value;

	Separator(String value)
	{
	  this.value = value;
	}
	
	 public String getValue()
	 {
		  return value;
		 
	 }
}