package exceptions;

public class Bounds {
    public static void main(String[] args) {
        String name = "Alex";
        int[] nums = { 1, 2, 3, 4 };

        try {
            System.out.println(name.charAt(6));
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("logic");
        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
