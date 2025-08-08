public class demo {
    int a = 10;
    void hello()
    {
    System.out.println("hello");
    System.out.println(a);
    }
    public static void main(String[] args) {
        demo d1 = new demo();//object create 
        d1.hello();
    }
}
