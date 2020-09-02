
public class StringTest2 {

	public static void main(String[] args) {
		// TODO String클래스의 특징
		
		// 동일한 값에 대해서 인스턴스 중복 생성 하지 않는다.
		String str1 = "java";
		String str2 = "java";
		
		if(str1==str2) {
			System.out.print("주소가 같다");
			
			
		}

		else {
			System.out.print("주소가 다르다");
		}
		
		if(str1.equals(str2)) {
			System.out.print("값이 같다");
		}
		
		else {
			System.out.print("값이 다르다");
		}
		
		
		// 값을 수정할 수 없다(불변성)
		 String str3 = "java";
		 String str4 = str3.concat("is beutiful"); //str4라는 다른 주소에 저장된다. 수정할 수 없기 떄문. 
		 System.out.print(str4);
		 
		 
		 if(str3==str4) {
				System.out.print("주소가 같다");
			}

			else {
				System.out.print("주소가 다르다");
			}
		 
		 //StringBuffer, StringBuilder : 값을 수정할 수 있다.
		 
		 StringBuffer str5  = new StringBuffer("java ");
		 StringBuffer str6  = str5.append("is beutiful");
		 System.out.println(str6);
		 
		 if(str5==str6) {
				System.out.println("주소가 같다");
			}

			else {
				System.out.println("주소가 다르다");
			}
		 
		 
		 System.out.println(str3);
		 System.out.println(str5);
		 // StringBuffer str7 = "java"(string클래스 - 캐스팅도 불가); string은 되지만 StringBuffer은 안됨
		 
		 
		 
		 
	}

}
