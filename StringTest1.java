
public class StringTest1 {

	public static void main(String[] args) {
		// TODO Sting Ŭ���� �⺻ ����
		
		String name1 = new String();
		name1 = "ȫ�浿";
		System.out.println(name1);
		
		String name2 = new String("�Ӳ���");
		System.out.println(name2);
		
		String name3 = "�ŵ���";
		System.out.println(name3);
		
		System.out.println(name3.length());
		System.out.println("�ŵ���".length()); //��ü.length() -> "�ŵ���" ��ü�� ��ü��� ��
	
		
		// char[][] names = new char[3][3];
		/* 
		char[][] names = {{'ȫ','��','��'},{'��','��','��'},{'��','��','��'}};
		
		for(int i=0; i<names.length; i++) {
			for(int j=0; j<names[i].length; j++) {
				System.out.print(names[i][j]);
			}
			System.out.println();
		
		}
		*/
		
		//String[] names = new String[3];
		
		
		String[] names = {"ȫ�浿","�Ӳ���","�ŵ���"};
		/*
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]);
		}
		*/
		
		
		//for-each  for���� : = ���̽��� in ����
		for(String name : names) {
			System.out.println(name);
		}
		
		
	}

}
