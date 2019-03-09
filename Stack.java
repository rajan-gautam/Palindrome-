package lab1;

public class Stack {
	 
	private char[] str;
	//private int UserArgs;
	Stack(int UserArgs){ //constructor
		str = new char[UserArgs];
		
	}
	
	
	public boolean push(char arg) {
		for(int i = 0; i <str.length; i++) 
		{
			//if(str[i].equals("")) { 
			
			if(str[i] == '\u0000') {
				str[i] = arg;
				return true;
				
			}
		} 
		
		return false;
	}

	public char pop() { //pop and return the string.
		
		char temp;
		for(int i = str.length - 1; i >= 0; i--) {
			if(str[i]!='\u0000') {
				temp = str[i];
				str[i] = '\u0000';
				return temp;
			}
		
		}
				
		return '\u0000';
			
	}
}

