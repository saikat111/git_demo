public class BubbleSort {
    public static void main(String aregs[]) {
        int[] intArray = {20, 35, -15, 7,55,1,-22};
        for (int unSortedindex = intArray.length - 1; unSortedindex > 0; unSortedindex--) {
            for (int i = 0; i < unSortedindex; i++) {
                if (intArray[i] < intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
        }
    }

    static void swap(int arr[], int i, int j) {
        if (i == j) {
            return;
        }
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
