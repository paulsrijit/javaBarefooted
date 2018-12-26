import java.util.Arrays;

public class InsertionSortDemo {
	public static void main(String args[]){
		//int[] inputArr = {1,20,5,18,7,33,23};
		int[] inputArr = {20,18,7,5,33,1,23};
		//int[] inputArr = {33,23,20,18,7,5,1};
		//int[] inputArr = {1, 5, 7, 18, 20, 23, 33};

		//--insertion sort--
		//complexity ::  best case -> O(n), worst case -> O(n^2)
		int len = inputArr.length;

		//creating a new array
		int[] outputArr = new int[len];

		//first element is copied directly as this is first element in new array
		outputArr[0] = inputArr[0];

		//going thru the input array, picking up each element
		for(int i = 1; i < len; i++){

			//name it as "key"
			int key = inputArr[i];
			System.out.println("Pass : " + i + ", Key : " + key);

			//going thru the new array
			int j = 0;
			while(j < i){

				//and search for the element which is greater than the key element
				if(key < outputArr[j]){

					//when found, shift all the elements of new array to right side
					for(int k = i-1; k >= j; k--){
						outputArr[k+1] = outputArr[k];
					}

					//and break from new array loop since new array is always sorted
					break;
				}
				j++;
			}

			//place key element in its right position
			outputArr[j] = key;
		}

		System.out.println("Array after sort :: " + Arrays.toString(outputArr));

	}
}