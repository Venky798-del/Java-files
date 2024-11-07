class Venky{
public static void main (String[]args)
{
int a=0,b=1,c=0,n=30,start=1;
System.out.println(a);
System.out.println(b);
while(start<=n)
{
c=a+b;//1
System.out.println(c+ " "+start);// 0 1 1 2 3 5 8 13
a=b;//1
b=c;//
start++;
}
System.out.println(start);
 }
  }
