//Find out middle index where sum of both ends are equal

public class FindMiddleIndex{
	public static void main(String args[]){
		int[] inputArray = {1,2,3,4,1,2,3};

		int middleIndex = -1;

		for(int i = 1; i < inputArray.length; i++){
			int leftSum = 0;
			int rightSum = 0;

			int j = 0;
			for( ; j < i; j++){
				leftSum = leftSum + inputArray[j];
			}

			int k = inputArray.length-1;
			for( ; k > i; k-- ){
				rightSum = rightSum + inputArray[k];
			}
			System.out.println("Pass:"+i+", left = "+leftSum+", right = "+rightSum+", j="+j+", k="+k);
			if(leftSum == rightSum && j == k && i == j){
				middleIndex = i;
				break;
			}
		}
		if(middleIndex != -1)
			System.out.println("Middle index found : "+middleIndex);
		else
			System.out.println("Middle index not found");
	}
}