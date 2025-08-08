import java.util.Scanner;

public class oddeven 
{
    public static void main(String[] args) 
    {
     Scanner s1 = new Scanner(System.in);
     int a;
     System.out.println("enter the value of a ");
     a = s1.nextInt();
     if(a%2==0)
     {
        System.out.println("number is even");
     }
     else
     {
        System.out.println("number is odd");
     }
    }
    
}
