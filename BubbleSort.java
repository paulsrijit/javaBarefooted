//bubble sort

public class BubbleSort {
	public static void main(String args[]){//testing new repo in win 7
		int[] inputArr = {2,3,10,1,15,7};

		for(int i=0; i<inputArr.length-1; i++){
			for(int j = 0; j < inputArr.length-1-i; j++){
				if(inputArr[j] > inputArr[j+1]){
					int temp = inputArr[j];
					inputArr[j] = inputArr[j+1];
					inputArr[j+1] = temp;
				}
			}
		}

		for(int k = 0; k<inputArr.length; k++){
			System.out.println(inputArr[k]);

		}
		System.out.println();
	}
}