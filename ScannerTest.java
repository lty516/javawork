
public class ScannerTest {

	public static void main(String[] args) {
		// TODO ������ �Է��� �ξ� ���ϰ�
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		  
		System.out.print("�̸�: ");
	    String name = scan.next();
	    System.out.println("����� �Է��� �̸��� "+ name);
	   
	    System.out.print("����: ");
	    int age = scan.nextInt();
	    System.out.println("����� ���̴� "+ age);
	    
	    System.out.print("����: ");
	    double point = scan.nextInt();
	    System.out.println("����� ������ "+ point);
	}

}
