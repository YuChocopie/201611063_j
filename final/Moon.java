class Moon{ 
   void count(int y){ 
      if(((y%4==0)&&(y%100!=0))||(y%400==0)){ 
         System.out.printf("%s is moonyear\n",y); 
      } 
      else{ 
         System.out.printf("%s is not moonyear\n",y); 
      } 
  } 
   public static void main(String[] args){ 
      Moon m = new Moon(); 
      int[] year = {1830,1880,1900,2222,2016,2040}; 
      for(int i=0; i<year.length; i++){ 
         m.count(year[i]); 
      }  
   } 
} 
