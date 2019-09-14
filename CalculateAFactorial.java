//Calculate a factorial

public class CalculateAFactorial {
	public static void main(String args[]){//test-1
		int input = 6;
		int result = 1;
		if(input==0){
			System.out.println("Can't find factorial of 0");
		}else if(input==1){
			System.out.println("Factorial of 1="+1);
		}else{
			for(int i = input; i > 1; i--){
				result = result * i;
			}
			System.out.println("Factorial of "+input+"="+result);
		}
	}
}
