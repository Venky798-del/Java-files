class Main
{ 

A()
{
  System.out.println("No PARAMETERIZED CONSTUCTOR");
}
A(int x)
{
   System.out.println("PARAMETERIZED CONSTUCTOR");
}
A(int x,char y)
{
   System.out.println("PARAMETERIZED CONSTUCTOR");
}
Public static void main(String [] args)
  {
    new Main();
    new Main(10);
    new Main(10,'a');

  }
}
