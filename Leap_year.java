//leap year
import java.util.Scanner;
class Leap_year
{
  public static void main(String args[])
  {
    int a;
    Scanner in=new Scanner(System.in);
    System.out.println("enter the number");
    a=in.nextInt();
    if(a%400==0)
    {
      System.out.println("it is leap year"+a);
    }
    else if((a%100==0)&&(a%400!=0))
    {
      System.out.println("it is not a leap year"+a);
    }
    else if((a%4==0)&&(a%100!=0))
    {
      System.out.println("it is a leap year"+a);
    }
    else
    {
      System.out.println("it is not a leap year"+a);
    }
  }
}
