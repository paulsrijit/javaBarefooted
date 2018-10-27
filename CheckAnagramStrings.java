//Write a program to check if two given String is Anagram of each other
import java.util.Arrays;

public class CheckAnagramStrings{
	public static void main(String args[]){
		String str1 = "Mary";
		String str2 = "Army";

		if(str1==null || str2==null || str1.trim().length()!=str2.trim().length()){
			System.out.println(str1+" and "+str2+" are not anagram");
		} else{
			char[] charArray1 = str1.trim().toLowerCase().toCharArray();
			char[] charArray2 = str2.trim().toLowerCase().toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			String s1 = new String(charArray1);
			String s2 = new String(charArray2);

			System.out.println(s1+", "+s2);

			if(s1.equalsIgnoreCase(s2)){
				System.out.println(str1+" and "+str2+" are anagram");
			}else {
				System.out.println(str1+" and "+str2+" are not anagram");
			}
		}
	}
}