class PowerNumber
{
 public static void main(String[] args)
 {
   int num=132,rem=0,sum=0,temp=num,p=1;
   while(num>0)
    {
      rem=num%10;
      sum=sum+rem;
      num=num/10;
    }
     System.out.println(sum);
   while(temp>0)
{
         int rem1=temp%10;
          p=p*rem1;
         temp=temp/10;
}
System.out.println(p);
         
}
}                                                    // sum=1+3+2=6
                                                                    //p=1*382=6