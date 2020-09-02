
public class BubbleSort {

	public static void main(String[] args) {
		// TODO 버블정렬
		int[] data = {8,9,7,2,5};
		
		/*
		 줄 더블클릭으로 break 포인트 만들기 후 
		 f11 -> break까지만 실행
		 다음 f5-> 코드 실행 알 수 있음
		 */

		 //-Bubble Sort 
		for(int i=0; i<data.length-1; i++) {
			for(int j=0; j<data.length-1; j++) {
				if(data[j]>data[j+1]) {
					int temp = data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		for(int i=0; i<data.length; i++ ) {
			System.out.print(data[i]+"");
		}
	}
	
		
		
		
	}

