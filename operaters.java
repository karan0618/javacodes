public class operaters {

    public static void main(String[] args) 
    {
        //assingment 
        int a=10;
        System.out.println(a+=2);
        System.out.println(a-=2);
        System.out.println(a*=2);
        System.out.println(a/=2);
        //logical
        int c=5,b=12;
        System.out.println(c>=10 && b>=10);
        //termary
        int min =(c>b)?b:c;
        System.out.println(min);
    }
}