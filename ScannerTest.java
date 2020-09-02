
public class ScannerTest {

	public static void main(String[] args) {
		// TODO 데이터 입력을 훨씬 편하게
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		  
		System.out.print("이름: ");
	    String name = scan.next();
	    System.out.println("당신이 입력한 이름은 "+ name);
	   
	    System.out.print("나이: ");
	    int age = scan.nextInt();
	    System.out.println("당신의 나이는 "+ age);
	    
	    System.out.print("점수: ");
	    double point = scan.nextInt();
	    System.out.println("당신의 점수는 "+ point);
	}

}
