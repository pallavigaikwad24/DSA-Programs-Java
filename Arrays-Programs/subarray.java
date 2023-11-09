public class subarray {

    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int maxSubarray(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                current = 0;
                for (int k = start; k <= end; k++) {
                    current += arr[k];
                }
                // System.out.println(current);
                maxSum = Math.max(maxSum, current);
            }
        }

        return maxSum;
    }

    public static int prefixSum(int arr[]) {

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < prefix.length; i++) {
            int sum = prefix[i - 1] + arr[i];
            prefix[i] = sum;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;

    }

    public static int kadanes(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        // subArray(arr);
        // System.out.println(maxSubarray(arr));
        // System.out.println(prefixSum(arr));
        System.out.println(kadanes(arr));
    }
}
