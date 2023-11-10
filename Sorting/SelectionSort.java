public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 9, 2, 3, 1 };

        for (int i = 0; i < arr.length; i++) {

            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
