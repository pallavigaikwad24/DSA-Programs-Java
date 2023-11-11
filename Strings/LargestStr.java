public class LargestStr {
    public static void main(String[] args) {
        String fruits[] = { "apple", "banana", "mongo", "peach" };

        String largeStr = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if (largeStr.compareTo(fruits[i]) < 0) {
                largeStr = fruits[i];
            }
        }

        System.out.println(largeStr);
        return;

    }

}
