
public class Sungjuk_v2 {

	public static void main(String[] args) {
		// TODO 2���� �迭�� �̿��� ����ǥ

		
		// ������ �غ�
		String[] names = {"����", "����","���"};
		
		int[][] sungjuk = {
				{1,98,90,0,0,0},
				{2,76,55,0,0,0},
				{3,85,73,0,0,0}
		};
		
		char[] grade = new char[3];  // ������ �޶� �迭�ȿ� ���� �� ����.
	
		
		// ����
		for(int i=0; i< sungjuk.length; i++) {
			 sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
		}
		
		// ���
		for(int i=0; i< sungjuk.length; i++) {
			 sungjuk[i][4] = sungjuk[i][3] /2 ;
		}
		
		// ����
		
		for(int i=0; i<sungjuk.length; i++) {
			if (sungjuk[i][4]>=90 ) {
				grade[i] = 'A';
			}
			
			else if (sungjuk[i][4]>=80 ) {
				grade[i] = 'B';
			}
			
			else if (sungjuk[i][4]>=70 ) {
				grade[i] = 'C';
			}
			
			else if (sungjuk[i][4]>=60 ) {
				grade[i]  = 'D';
			}
			
			else {
				grade[i] = 'F';
			}
		}
			
			
		
		// ���
		
			for(int i=0; i<sungjuk.length; i++) {
				sungjuk[i][5] = 1;
				for(int j = 0 ; j < sungjuk.length; j++) {
				if(sungjuk[i][3] < sungjuk[j][3]) {
				sungjuk[i][5] = sungjuk[i][5] + 1;
				}
				}
				}
	
		//1���� �迭�� �����͸� �ű�. 2������ �ּҸ� �ű�� ��.
			System.out.println("�й�\t�̸�\t����\t����\t����\t���\t����\t����");
		      for(int i=0; i<sungjuk.length; i++) {
		      System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] +
		      "\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + 
		      sungjuk[i][4] + "\t" + grade[i] + "\t" + sungjuk[i][5]);
		      }
			
	
				
	      //����
	      System.out.println("\n\n ���� ��");
	      
	      // selection Sort �������� ��������
	      for(int i=0; i < sungjuk.length-1 ; i++) {
	          for(int j = i +1; j <sungjuk.length ; j++) {
	             if (sungjuk[i][3] < sungjuk[j][3]) {
	                int[] i_temp = sungjuk[i];
	                sungjuk[i] = sungjuk[j];
	                sungjuk[j] = i_temp;
	                
	                String s_temp = names[i];
	                names[i] = names[j];
	                names[j] = s_temp;
	                
	           
	                char c_temp = grade[i];
	                grade[i] = grade[j];
	                grade[j] = c_temp;
	                
	             }
	          }
	       }
		
		
		
		
		
		
		
	      System.out.println("�й�\t�̸�\t����\t����\t����\t���\t����\t����");
	      for(int i=0; i<sungjuk.length; i++) {
	      System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] +
	      "\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + 
	      sungjuk[i][4] + "\t" + grade[i] + "\t" + sungjuk[i][5]);
	      }
		
		
		
		
		
		
		
	}



		
		
		
		
	}


