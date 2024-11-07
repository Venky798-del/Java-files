class Grade
{
    public static void main(String[] args)
    {
        int s1=10;
        int s2=9;
        int s3=9;
        int s4=20;
        int s5=7;
        int s6=5;
        int total=s1+s2+s3+s4+s5+s6;
     System.out.println(total);
     if(total>80)
     {
         System.out.println("the grade is O");
     }
      else if(total>60)
     {
         System.out.println("the grade is A");
     }
      else if (total>40)
     {
         System.out.println("the grade is B");
     }
     else if (total>30)
     {
     System.out.println("the grade is C");
     }
     else
     System.out.println("it is fail");
    }
}