package lab1;

public class Palindrome {
	
	private static boolean isPalindrome(String stringInput) {
		
		/* String newString = stringInput.toUpperCase(); */
		for(int i = 0, j = stringInput.length() -1; i !=j && i <j; i++, j-- ) {
			if(stringInput.charAt(i) != stringInput.charAt(j)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		//System.out.println(args.length);+
		for(int i = 0; i <args.length;i++) {
			Stack myStack = new Stack(args[i].length());
			

			for(int j = 0; j <args[i].length(); j++) 
				myStack.push(args[i].charAt(j));
			
		
			String strin = new String();
			for(int j = 0 ; j< args[i].length(); j++)
				strin += myStack.pop();
			
			if(strin.equals(args[i])) 
				System.out.println(args[i] + " is a Palindrome");
			
			else {
			System.out.println(args[i] + " is not a palindrome");
			
			}
			strin = "";
		}
		
	}	
}


