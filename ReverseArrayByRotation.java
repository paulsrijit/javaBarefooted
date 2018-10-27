//Reverse an integer array by rotation
//Input: 1,2,3,4,5,6,7
//Output: 7,1,2,3,4,5,6 | 7,6,1,2,3,4,5 | 7,6,5,1,2,3,4 | 7,6,5,4,1,2,3 | 7,6,5,4,3,1,2 | 7,6,5,4,3,2,1

import java.util.Arrays;

public class ReverseArrayByRotation {
	public static void main(String args[]){

		Integer[] inputArray = {1,2,3,4,5,6,7};
		Integer[] outputArray = new Integer[inputArray.length];
		Integer[] tempArray;

		for(int i = 0; i < inputArray.length-1; i++){
			int tempArrayLength = inputArray.length-1-i;
			outputArray[i] = inputArray[tempArrayLength];

			tempArray = new Integer[tempArrayLength];
			for(int j = 0; j < tempArrayLength; j++){
				tempArray[j] = inputArray[j];
			}

			//System.out.println("tempArray::"+Arrays.asList(tempArray));

			int outputIndex = i+1;
			for(int k = 0; k < tempArray.length; k++){
				outputArray[outputIndex] = tempArray[k];
				outputIndex++;
			}

			System.out.println(Arrays.asList(outputArray));
		}
	}
}