//Reverse an array of integer

import java.util.Arrays;

public class ReverseArray {
	public static void main(String args[]){
		Integer[] inputArray = {1,2,3,4,5,6,7};
		Integer[] outputArray = new Integer[inputArray.length];
		for(int i = 0; i < inputArray.length; i++){
			outputArray[inputArray.length-1-i] = inputArray[i];
		}
		System.out.println(Arrays.asList(outputArray));
	}
}