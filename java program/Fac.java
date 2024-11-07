class Fac
{
 public static void main(String[] args)
{  
int s=1,n=25,h=1;
        while(s<=n/2)
        {
          if(n%s==0)
          {
            h=s; 
              System.out.println(h);
          }
           s++;
        }
       
     System.out.println("the least factor is" +" "+ h);
 }
}