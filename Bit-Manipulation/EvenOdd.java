public class EvenOdd {
    public static void main(String[] args) {
        int value = 10;
        int bitmask = 1;

        if ((value & bitmask) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

}
