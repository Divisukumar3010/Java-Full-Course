 class demo {
    public int meth(int a ,int b){
        return a + b;
    }
    public int meth(int x,int y,int z){
        return x+y+z;
    }
    public int meth(int a){
        return a;
    }
}
public class Method_Overloading{
    public static void main(String[] args) {
        demo d=new demo();
        System.out.println(d.meth(20));
        System.out.println(d.meth(20,30));
        System.out.println(d.meth(20,30,40));
    }
}
