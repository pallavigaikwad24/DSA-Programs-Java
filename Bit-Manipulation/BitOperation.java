public class BitOperation {

    public static int getBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearBit(int n, int i) {
        int bitmask = (1 << i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        // System.out.println(getBit(5, 0));
        // System.out.println(setBit(5, 1));
        System.out.println(clearBit(5, 2));
    }
}
