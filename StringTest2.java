
public class StringTest2 {

	public static void main(String[] args) {
		// TODO StringŬ������ Ư¡
		
		// ������ ���� ���ؼ� �ν��Ͻ� �ߺ� ���� ���� �ʴ´�.
		String str1 = "java";
		String str2 = "java";
		
		if(str1==str2) {
			System.out.print("�ּҰ� ����");
			
			
		}

		else {
			System.out.print("�ּҰ� �ٸ���");
		}
		
		if(str1.equals(str2)) {
			System.out.print("���� ����");
		}
		
		else {
			System.out.print("���� �ٸ���");
		}
		
		
		// ���� ������ �� ����(�Һ���)
		 String str3 = "java";
		 String str4 = str3.concat("is beutiful"); //str4��� �ٸ� �ּҿ� ����ȴ�. ������ �� ���� ����. 
		 System.out.print(str4);
		 
		 
		 if(str3==str4) {
				System.out.print("�ּҰ� ����");
			}

			else {
				System.out.print("�ּҰ� �ٸ���");
			}
		 
		 //StringBuffer, StringBuilder : ���� ������ �� �ִ�.
		 
		 StringBuffer str5  = new StringBuffer("java ");
		 StringBuffer str6  = str5.append("is beutiful");
		 System.out.println(str6);
		 
		 if(str5==str6) {
				System.out.println("�ּҰ� ����");
			}

			else {
				System.out.println("�ּҰ� �ٸ���");
			}
		 
		 
		 System.out.println(str3);
		 System.out.println(str5);
		 // StringBuffer str7 = "java"(stringŬ���� - ĳ���õ� �Ұ�); string�� ������ StringBuffer�� �ȵ�
		 
		 
		 
		 
	}

}
