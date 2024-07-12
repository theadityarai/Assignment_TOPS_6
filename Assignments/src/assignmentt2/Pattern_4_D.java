package assignmentt2;
/*
 	1
   2 2
  3 3 3
 4 4 4 4
 */

public class Pattern_4_D {

	public static void main(String[] args) {
		
		 for (int i = 1; i <= 4; i++) {
	            for (int k = i; k <= 4; k++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }

	}

}
