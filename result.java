import java.util.Scanner;

public class result 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sub1,sub2,sub3;
        double grade;
        int per;
        //subject 1
        System.out.println("enter the sub1 marke");
        sub1 = sc.nextInt();
        
        //subject 2
        System.out.println("enter the sub2 marke");
        sub2 = sc.nextInt();
        
        //subject 3
        System.out.println("enter the sub3 smarke");
         sub3 = sc.nextInt();
        

        per = (sub1+sub2+sub3);
        grade = per/3;
        if(grade>75)
        {
            System.out.println("dist");
        }
        else if (grade>=60) 
        {
            System.out.println("first");
        } 
        else if (grade>=35) 
        {
            System.out.println("second"); 
        }
        else if (grade<35) 
        {
            System.out.println("fail");   
        }
     }
}