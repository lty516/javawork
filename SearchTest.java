
public class SearchTest {


	public static void main(String[] args) throws java.io.IOException{
		// TODO �迭�� ���� : �˻�
		
		char[] data = {'a','b','c','d','e','f','g'};
		boolean flag = true;
		
		System.out.print("ã�� ���� : ");
	
		char input = (char)System.in.read();
		
		int i=0;
			for( i=0; i<data.length; i++) {
				if(data[i] == input) {
					flag = true;
				
					break;
			}
			
				else {
					flag = false;
				
			}
		
			}
				if(flag == true) {
					System.out.println("ã�Ҵ�."+ (i+1) + "��°�� �ִ�.");
			
		}
				else {
				System.out.println("��ã�Ҵ�.");
		}

	}
	}

