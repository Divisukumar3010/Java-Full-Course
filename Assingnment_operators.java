public class Assingnment_operators
{
    public static void main(String[] args) 
    {
        int a = 7;
        a += 2;
        System.out.println(a);
        a -= 2;
        System.out.println(a);
        a *= 4;
        System.out.println(a);
        a /= 5;
        System.out.println(a);
        a %= 3;
        System.out.println(a);
        a = a++;            // post-increment
        System.out.println(a);
        a = ++a;            // pre-increment
        System.out.println(a);
        a = a--;            // post-decrement
        System.out.println(a);
        a = --a;            // pre-decrement
        System.out.println(a);
    }
}