class Main2 extends parent
{
   public void m1(int x)
  {
    System.out.println("i am in child");
  }
  
   public static void main (String []arg)
  {
     Main2 main;//Referrence type
     main=new Main2();//object type
     main.m1();
     main.m2();
     
}

}
class parent
{
 public void m1()
  {
    System.out.println("i am in parent");
  }
   public void m2()
  {
    System.out.println("i am in parent");
  }


}