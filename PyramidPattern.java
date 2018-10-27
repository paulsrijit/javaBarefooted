//Print a pyramid pattern

public class PyramidPattern {
	public static void main(String args[]){
		int levels = 5;
		for(int i = 1; i <= 5; i++){

			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}