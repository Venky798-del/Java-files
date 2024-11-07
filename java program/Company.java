class Company
{
 public static void main(String[] args)
 {
  int age=25;
  String gender="male";
  String gender1="female";
  String city="hyd";
  String health="excellent";
  String vilage="rct";
  int s=200000;
  int n=1000;
  int t=s%1000;
  System.out.println(t);
  if(gender=="male"||gender1=="female")
  {
   if(gender=="female"&&age>=25&&age<=35&&city=="hyd"&&health=="excellent"&&t==1)
   {
    System.out.println("premium per 2 lakhs");
   }
       else if(gender=="male"&&age>=25&&age<=35&&city=="hyd"&&health=="excellent"&&t==0)
    {
     System.out.println("premium per 1 lakhs");
    }
    else if(gender=="male"&&age>=25&&age<=35&&vilage=="rct"&&health=="excellent"&&t==0)
   {
    System.out.println("premium per 10,000");
   }
     else
   {
     System.out.println("The person not helthy");
    }
   }
 }
}