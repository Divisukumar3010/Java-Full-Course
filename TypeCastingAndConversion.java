public class TypeCastingAndConversion{
    public static void main(String[] args) {
        byte b= 12;
        int i= b;
        System.out.println(i);

        float f = 12.6f;
        int i1 = (int) f;
        double d = 12.235648d;
        int i2 = (int) d;
        System.out.println(i1);
        System.out.println(i2);
    }
}