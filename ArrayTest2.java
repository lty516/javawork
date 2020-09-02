
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO 기본적인 다차원 배열 생성 방법
		/* int[] ar1 = {1,2,3,4,5};
		int[] ar2 = {6,7,8,9,10};
		int[] ar3= {11,12,13,14,15};
		
		int[][] arr = new int[3][5];
		arr[0][0]=1;l
		arr[0][1] = 2;

		 */
		 int[][] arr = { {1, 2, 3, 4, 5}, 
                {6, 7, 8, 9, 10}, 
                {11, 12, 13, 14, 15} };
		 
		
    
		for(int i = 0; i < arr.length; i++) {
    	   for(int j = 0; j < arr[i].length; j++) {
          System.out.print(arr[i][j] + "\t");
       }
       System.out.println();

	} 
	
		System.out.println("*************************");
		
		int[][][] dim3 = { {{1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15}},
							
							{{16,17,18,19,20},
							{21,22,23,24,25},
							{26,27,28,29,30}}
				};
			
		System.out.println(dim3.length);  //2
		
		for ( int i = 0; i < dim3.length; i++) {
			for(int j = 0; j < dim3[i].length; j++) {
				for ( int k =0 ; k < dim3[i][j].length; k++) {
					System.out.print(dim3[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		} 
}
}
