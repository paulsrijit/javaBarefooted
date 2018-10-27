//Write a program to print fibonacci series upto 100

public class WriteFibonacciSeries {
	public static void main (String args[]){
		new WriteFibonacciSeries().printFibonacciSeries(100);
	}

	private void printFibonacciSeries(int maxVal){
		int numBeforeThat = 0;
		int numBefore = 1;
		int currentNum;

		System.out.println(numBeforeThat);
		System.out.println(numBefore);

		while(true){
			currentNum = numBefore + numBeforeThat;
			if(currentNum <= maxVal){
				System.out.println(currentNum);
				numBeforeThat = numBefore;
				numBefore = currentNum;
			} else{
				break;
			}
		}
	}
}