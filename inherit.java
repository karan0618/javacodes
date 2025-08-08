public class inherit 
{
class p{
    void par()
    {
        System.out.println("hello");
    }
}    
class C extends p
{
    void ch()
    {
        System.out.println("world");
    }
}
public static void main(String[] args) {
    inherit inh = new inherit();
    C c1 = inh.new C();
    c1.par();
    c1.ch();
}
}
