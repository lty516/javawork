
public class BubbleSort {

	public static void main(String[] args) {
		// TODO ��������
		int[] data = {8,9,7,2,5};
		
		/*
		 �� ����Ŭ������ break ����Ʈ ����� �� 
		 f11 -> break������ ����
		 ���� f5-> �ڵ� ���� �� �� ����
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

