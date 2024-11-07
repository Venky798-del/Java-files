class Hello
{
	 public static void main (String [] arg)
	{
          Main m=new Main();
         Main m1=new Main(20,Venky);
         m1.p1();
    }
}
class Main
{
  Main()
  {
    int x;
    int y;
  }
  Main(int x,String y)
  {
    x=10;
    y="venky";
  }
  Main(char A,int a,String s)
  {
    A='B';
    a=20;
    s="vmc";
  }
  public void p1()
{
 Sytem.out.println("s "+s+"a "+a);
}
}