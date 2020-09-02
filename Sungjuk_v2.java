
public class Sungjuk_v2 {

	public static void main(String[] args) {
		// TODO 2차원 배열을 이용한 성적표

		
		// 데이터 준비
		String[] names = {"유비", "관우","장비"};
		
		int[][] sungjuk = {
				{1,98,90,0,0,0},
				{2,76,55,0,0,0},
				{3,85,73,0,0,0}
		};
		
		char[] grade = new char[3];  // 형식이 달라서 배열안에 넣을 수 없다.
	
		
		// 총점
		for(int i=0; i< sungjuk.length; i++) {
			 sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
		}
		
		// 평균
		for(int i=0; i< sungjuk.length; i++) {
			 sungjuk[i][4] = sungjuk[i][3] /2 ;
		}
		
		// 학점
		
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
			
			
		
		// 등수
		
			for(int i=0; i<sungjuk.length; i++) {
				sungjuk[i][5] = 1;
				for(int j = 0 ; j < sungjuk.length; j++) {
				if(sungjuk[i][3] < sungjuk[j][3]) {
				sungjuk[i][5] = sungjuk[i][5] + 1;
				}
				}
				}
	
		//1차원 배열은 데이터를 옮김. 2차원은 주소를 옮기면 됨.
			System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t순위");
		      for(int i=0; i<sungjuk.length; i++) {
		      System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] +
		      "\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + 
		      sungjuk[i][4] + "\t" + grade[i] + "\t" + sungjuk[i][5]);
		      }
			
	
				
	      //정렬
	      System.out.println("\n\n 정렬 후");
	      
	      // selection Sort 총점기준 내림차순
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
		
		
		
		
		
		
		
	      System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t순위");
	      for(int i=0; i<sungjuk.length; i++) {
	      System.out.println(sungjuk[i][0] + "\t" + names[i] + "\t" + sungjuk[i][1] +
	      "\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + 
	      sungjuk[i][4] + "\t" + grade[i] + "\t" + sungjuk[i][5]);
	      }
		
		
		
		
		
		
		
	}



		
		
		
		
	}


