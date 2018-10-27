//Print a symmetric pyramid pattern

public class SymmetricPyramidPattern{
	public static void main(String args[]){
		int levels = 5;

		for(int i = 0; i <= levels; i++){
			int gaps = levels - i;
			//left gaps
			for(int j = 1; j <= gaps; j++){
				System.out.print(" ");
			}

			//asteriks
			if(i==0){
				System.out.print("*");
			}else{
				for(int k = 1; k <= (i*2)+1; k++){
					System.out.print("*");
				}
			}

			//right gaps
			for(int j = 1; j <= gaps; j++){
				System.out.print(" ");
			}

			//new line
			System.out.println("");

		}
	}
}