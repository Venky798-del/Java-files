class Factors
{
	 public static void main(String[] args)
	{
	 int s=1,n=23,c=0;
 	while(s<=n)
 	{
 	 if(n%s==0)
  	{
         c++;
         
  	 System.out.println(s);
  	}
	 s++;
      }
       System.out.println(c);
       if(c==2)
       {
        System.out.println(c+" it is prime number");
	}
	else
	{
	System.out.println(c+" not prime number");
        }
     
    }
}