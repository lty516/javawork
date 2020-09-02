
public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {8,9,7,2,5};
		
		for(int i=0; i<data.length-1; i++) {
			for(int j=0; j<data.length-1; j++) {
				if(data[i]>data[j]) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}

			}
		}
		for(int i=0; i<data.length; i++ ) {
			System.out.print(data[i]+"");
		}

	}

}
