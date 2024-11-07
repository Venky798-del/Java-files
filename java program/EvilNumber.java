class EvilNumber
{
 public static void main(String[] args)
 {
  int num=9,p=0,rem=0,sum=0;
               p=(int)Math.pow(num,2);//81
               System.out.println(p);
          while(p!=0)
          {
            rem=p%10;//1
            sum=sum+rem;//0+1=1,1+8=9         
             p=p/10;//9,0
          }
           System.out.println(sum);
       if(num==sum)
       {
        System.out.println("EvilNumber");
       }
      else
       System.out.println("not Evil Number");
  }
}
     
   
 