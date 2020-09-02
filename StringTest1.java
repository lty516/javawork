
public class StringTest1 {

	public static void main(String[] args) {
		// TODO Sting 클래스 기본 사용법
		
		String name1 = new String();
		name1 = "홍길동";
		System.out.println(name1);
		
		String name2 = new String("임꺽정");
		System.out.println(name2);
		
		String name3 = "신돌석";
		System.out.println(name3);
		
		System.out.println(name3.length());
		System.out.println("신돌석".length()); //객체.length() -> "신돌석" 자체가 객체라는 것
	
		
		// char[][] names = new char[3][3];
		/* 
		char[][] names = {{'홍','길','동'},{'임','꺽','정'},{'신','돌','석'}};
		
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names[i].length; j++) {
				System.out.print(names[i][j]);
			}
			System.out.println();
		
		}
		*/
		
		//String[] names = new String[3];
		
		
		String[] names = {"홍길동","임꺽정","신돌석"};
		/*
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]);
		}
		*/
		
		
		//for-each  for문에 : = 파이썬의 in 역할
		for(String name : names) {
			System.out.println(name);
		}
		
		
	}

}
