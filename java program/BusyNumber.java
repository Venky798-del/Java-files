class BusyNumber
 {
  public static void main(String[] args)
 {
   int num=107,temp=num,rem=0,s=1,c=0;
   while(num!=0)
   {
       rem=num%10;
       num=num/10;
   }
if(temp==rem)
  System.out.println("BusyNumber");
  else
System.out.println("Not BusyNumber");
         
 }
}