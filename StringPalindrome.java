//Write a simple Java program to check if a given String is palindrome or not

public class StringPalindrome {
	public static void main(String args[]){
		String inputString = "Abba  ";
		if(new StringPalindrome().checkPalindrome(inputString)){
			System.out.println(inputString+": is palindrome");
		}else{
			System.out.println(inputString+": is not palindrome");
		}

	}

	private boolean checkPalindrome(String input){
		String reverseString = "";
		boolean result = false;

		if(input == null){
			return false;
		}else if(input.trim().equals("")){
			return true;
		}else{
			String inputStr = input.trim();

			for(int i = inputStr.length()-1; i >= 0; i--){
				reverseString = reverseString + inputStr.charAt(i);
			}
			//System.out.println(input);
			//System.out.println(reverseString);

			if(inputStr.equalsIgnoreCase(reverseString)){
				result = true;
			}else{
				result = false;
			}
		}

		return result;

	}
}