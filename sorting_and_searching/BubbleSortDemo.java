import java.util.Arrays;

public class BubbleSortDemo{
	public static void main(String args[]){
		int[] inputArr = {1,20,5,18,7,33,23};
		//int[] inputArr = {1, 5, 7, 18, 20, 23, 33};
		boolean swapFlag = false;
		//bubble sort ascending order
		//complexity ::  best case -> O(n), worst case -> O(n^2)
		for(int i = 0; i < inputArr.length - 1; i++){
			for(int j = 0; j < inputArr.length - 1; j++){
				if(inputArr[j] > inputArr[j+1]){
					//swap
					swapFlag = true;
					int temp = inputArr[j];
					inputArr[j] = inputArr[j+1];
					inputArr[j+1] = temp;
				}
			}
			if(!swapFlag){
				System.out.println("No swapping. Already sorted! Breaking loop.");
				break;
			}

		}
		System.out.println("Sorted ::" + Arrays.toString(inputArr));
	}

}