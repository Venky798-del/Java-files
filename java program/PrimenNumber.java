class PrimenNumber
{
 public static void main(String[] args)
{
   int s=1,n=6,c=0;
    while(s<=7)
  {
  if(n%s==0)
 {
       c++;
 }
 s++;
 }
 System.out.println(c);
 if(c==2)
 {
   System.out.println(c+ "Primenumber");
 }
  else
 {
  System.out.println(c  + "not primenumber");
 }
} 
}