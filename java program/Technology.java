class Technology
{
 public static void main(String[] args)
{
  int num=2025,temp=num,rem=0,sum=0,p=0;
  while(num!=0)
	{
         rem=num%100;
          num=num/100;
          //break;
          sum=rem+num;
          p=(int)Math.pow(sum,2);
          break;
	//System.out.println(sum+"  "+p);
     }
      if(temp==p)
      {
         System.out.println(p+"Technology");
      }

    }
}
        	