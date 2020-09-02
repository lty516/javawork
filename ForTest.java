class ForTest{
   public static void main(String[] args){
      /*
      int cnt = 0, sum = 0;
      while(cnt <= 10){
         sum += cnt;
         cnt++;
      }
      System.out.println(sum);
      */
      
      /*
      int sum = 0;
      for( ; cnt <= 10;){
         cnt++;
         sum += cnt;
      }
      System.out.println(sum);
      */
      
      /*
      int cnt = 0, sum = 0;
      for( ; ; ){
         cnt++;
         
         if(cnt <= 10)
            break;
         sum += cnt;
      }
      
      System.out.println(sum); 
      */
      
      int cnt;
      for(cnt = 0; cnt <= 8; cnt ++){
         cnt += cnt;
      }
      System.out.println(cnt);
   }
}