class PerfectSquare
{
 public static void main(String[] args)
{
       int n=1;
       int end=1000;
       while(n<=end)
       {
            
            double sqt=Math.sqrt(n);
            int sqt1 =(int)sqt;
            if(sqt==sqt)
            {
               System.out.println(n);
            }
             n++;
       }
    
    }
}