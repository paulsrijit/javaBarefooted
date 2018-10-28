//Write a program to find unique numbers from a array of integers.

public class MyClazz {//test
	public static void main(String args[]){
		Integer[] input = {2,3,2,4,5,6,7,6,8,9};
		Integer[] output = new MyClazz().createUniqueIntegerArray(input);

		for(int indx = 0; indx < output.length; indx++){
			System.out.println(output[indx]);
		}
	}

	private Integer[] createUniqueIntegerArray(Integer[] arr){
		Integer[] finalArray = new Integer[arr.length];
		int j = 0;
		for(int i=0; i < arr.length; i++){
			if(!checkIfPresentInArray(arr[i], finalArray)){
				finalArray[j] = arr[i];
				j++;
			}
		}

		return finalArray;
	}

	private boolean checkIfPresentInArray(int e, Integer[] arr){

		for(int k = 0; k < arr.length; k++){
			if(arr[k]!=null && arr[k]==e){
				return true;
			}
		}

		return false;
	}
}