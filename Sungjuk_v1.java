
public class Sungjuk_v1 {

	public static void main(String[] args) {
		// TODO 1���� �迭�� �̿��� ����ǥ
		
		// ������ �غ�
		String[] names = {"����", "����", "���"};
		
		int[] no = {1, 2, 3};
		int[] kor = {98, 76, 85};
		int[] eng = {90, 55, 73};

		int[] tot = new int[3];
		int[] avg = new int[3];
		char[] grade = new char[3];
		int[] rank = new int[3];

		// ����
		for(int i=0; i<no.length; i++) {
			tot[i] = kor[i] + eng[i];
		}
		
		// ���
		for(int i=0; i<tot.length; i++) {
			avg[i] = tot[i]/2;
		}
		
		// ����
		for(int i=0; i<tot.length; i++) {
			int g = avg[i]/10;
			if(g == 10) {
				grade[i] = 'A';
			} else if(g == 9) {
				grade[i] ='A';
			} else if(g == 8) {
				grade[i] = 'B';
			} else if(g == 7) {
				grade[i] = 'C';
			} else if(g == 6){
				grade[i] ='D';
			} else {
				grade[i] = 'F';
			}
		}
		
		// ���
		for(int i=0; i<tot.length; i++) {
			rank[i] = 1;
			for(int j=0; j<tot.length; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}	
		
		System.out.println("�й�\t�̸�\t����\t����\t����\t���\t����\t����");
		System.out.println("------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + names[i] + "\t" + kor[i] +
							"\t" + eng[i] + "\t" + tot[i] + "\t" + avg[i] +
							"\t" + grade[i] + "\t" + rank[i]);
		}
		
		System.out.println("\n\n ���� �� ....");
		
		// SelectionSort, ���� ���� ��������
		for(int i=0; i<no.length-1; i++) {
			for(int j=i+1; j<no.length; j++) {
				if(tot[i] < tot[j]) {
					int i_temp = no[i];
					no[i] = no[j];
					no[j] = i_temp;
					
					String s_temp = names[i];
					names[i] = names[j];
					names[j] = s_temp;
					
					i_temp = kor[i];
					kor[i] = kor[j];
					kor[j] = i_temp;
					
					i_temp = eng[i];
					eng[i] = eng[j];
					eng[j] = i_temp;
					
					i_temp = tot[i];
					tot[i] = tot[j];
					tot[j] = i_temp;
					
					i_temp = avg[i];
					avg[i] = avg[j];
					avg[j] = i_temp;
					
					char c_temp = grade[i];
					grade[i] = grade[j];
					grade[j] = c_temp;
					
					i_temp = rank[i];
					rank[i] = rank[j];
					rank[j] = i_temp;
				}
			}
		}
		
		System.out.println("�й�\t�̸�\t����\t����\t����\t���\t����\t����");
		System.out.println("------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + names[i] + "\t" + kor[i] +
							"\t" + eng[i] + "\t" + tot[i] + "\t" + avg[i] +
							"\t" + grade[i] + "\t" + rank[i]);
		}

	}

}