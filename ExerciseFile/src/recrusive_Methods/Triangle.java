package recrusive_Methods;

public class Triangle {

	public static void main(String[] args) {


		
		/* We have triangle made of blocks. The topmost row has 1 block, 
		 * the next row down has 2 blocks, the next row has 3 blocks, and so on. 
		 * Compute recursively (no loops or multiplication) 
		 * the total number of blocks in such a triangle with the given number of rows.

			
			triangle(0) → 0
			triangle(1) → 1
			triangle(2) → 3
					 * 
					 */
		
		int row = 5;
		
		triangle(row);
		
		System.out.println(triangle(row));
		
		
		
	}

	private static int triangle(int num) {

		int counter = num+1;
		
		if(num < 0) {
			return 0;
		}else {
			counter--;
			return counter + triangle(num-1);
		}
		
		
		
		
	}

}
