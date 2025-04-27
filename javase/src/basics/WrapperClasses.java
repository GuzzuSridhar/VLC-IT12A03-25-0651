package basics;

public class WrapperClasses {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte bytePrim = 10; // primitive type
        Byte byteWrap = 10; // Object Type

        int agePrim = 25; // // primitive type
        Integer ageWrap = 25; // primitive type

        float temp = ageWrap.floatValue();
        System.out.println(temp);

        // Boxing and Unboxing
        // boxing (implicit) converts primitive types to wrapper class
        int num = 10;
        Integer num1 = num;
        // boxing (implicit) converts wrapper class to primitive types
        Integer n1 = 100;
        int n2 = n1;

        System.out.println(" The properties of types");
        System.out.println(" -------------Byte--------------------");
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(" -------------Short--------------------");
        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(" -------------Integer--------------------");
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(" -------------Long--------------------");
        System.out.println(Long.SIZE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(" -------------Float--------------------");
        System.out.println(Float.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(" -------------Double--------------------");
        System.out.println(Double.SIZE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(" -------------Character--------------------");
        System.out.println(Character.SIZE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

    }
}
