public class StringBuilders {

    // Convert the First letter of each word to uppercase.
    public static void toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char firstChar = Character.toUpperCase(str.charAt(0));
        sb.append(firstChar);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }

    public static void stringCompression(String str) {
        StringBuilder newstr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            newstr.append(str.charAt(i));
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            if (count > 1) {
                newstr.append(count);
            }
        }

        System.out.println(newstr);
        return;
    }

    public static void main(String[] args) {
        // String str = "hi, i am abc";
        // toUpperCase(str);

        String str = "aaabbc";
        stringCompression(str);
    }
}
