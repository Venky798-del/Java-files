class EvenOdd
{
 public static void main(String[] args)
{
 int n=3;r=10;
 while(n>10)
 {
  if(n%2!=0)
  n=n/2;
  System.out.println("it is even"+ +n);
  n=3*n+1;
 System.out.println("it is odd"+ +n);
 }
System.out.println(n);
}
}
class HelloWorld {
    public static void main(String[] args) {
        int n=5,x=1;
        System.out.println(n);
        while(x>0)
        {
            if(n%2!=0)
            n=(n*3)+1;
            else
            {
            n=n/2;
            }
            System.out.println(n);
            if(n==1)
            break;
            x++;
        }
        }
    }
