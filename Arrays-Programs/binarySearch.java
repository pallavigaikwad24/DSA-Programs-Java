class binarySearch {

    public static int binary(int arr[], int key) {
        // Array should be sorted
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        int result = binary(arr, 99);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key is not found");
        }
    }
}