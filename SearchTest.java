
public class SearchTest {


	public static void main(String[] args) throws java.io.IOException{
		// TODO 배열의 응용 : 검색
		
		char[] data = {'a','b','c','d','e','f','g'};
		boolean flag = true;
		
		System.out.print("찾는 문자 : ");
	
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
					System.out.println("찾았다."+ (i+1) + "번째에 있다.");
			
		}
				else {
				System.out.println("못찾았다.");
		}

	}
	}

