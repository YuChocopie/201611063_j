public class Average {
    public void average(int[][] data) {
        int woman = 0;
        for (int i=0;i<data.length;i++) {
            woman += data[i][1];
        }
        System.out.println("Seoul Women population : "+ woman);
        
        double wAver = (double)woman/data.length; 
        System.out.printf("Seoul Women average : %.1f\n",wAver); 
        
        
        int man = 0;
        for (int i=0;i<data.length;i++) {
            man += data[i][0];
        }
        System.out.println("Seoul Men population is : "+ man);
        
        double mAver = (double)man/data.length; 
        System.out.printf("Seoul Men average is : %.1f\n",mAver);
        
        
        for(int i=0;i<data.length;i++) {
            int Sum = 0;
            double guAver = 0;
            Sum = data[i][0]+data[i][1];
            guAver = (double)Sum/2;
            System.out.println("city"+"["+(i+1)+"]"+" total population  : "+Sum); 
            System.out.printf("city"+"["+(i+1)+"]"+" average : %.1f\n",guAver); 

         }
     }
     public static void main(String[] args) {
         Average a=new Average();
         int[][] data={
                  {74425, 76326},
                  {61164, 61636},
                  {109688, 115744},
                  {144796, 146776},
                  {174996, 181676},
                  {177841, 177434},
                  {204630, 205980},
                  {223373, 232245},
                  {161055, 166130},
                  {171576, 176735},
                  {279169, 293772},
                  {239450, 251066},
                  {148690, 156510},
                  {182977, 196992},
                  {237792, 242641},
                  {283869, 296762},
                  {209344, 210282},
                  {118965, 114441},
                  {186503, 186856},
                  {195734, 203014},
                  {254381, 249472},
                  {212401, 229111},
                  {271654, 295354},
                  {319197, 335045},
                  {229829, 231671}
              };
              a.average(data);
       }
}