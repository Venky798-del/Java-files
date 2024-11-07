class LeapYear
{
 public static void main(String[] args)
 {
  int year=1900;
  while(year<=2000)
  {
    if(year%4==0&&year%100!=0||year%400==0)
     {
	System.out.println("it is leapyear"+year);
      }
        else
            {
 		System.out.println("it is not leap year"+year);
	     }
      	year++;
   }
 }
}