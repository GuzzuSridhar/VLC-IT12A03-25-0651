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

    }
}
