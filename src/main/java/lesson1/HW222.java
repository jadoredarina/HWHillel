package lesson1;

import java.util.Arrays;

public class HW222 {

    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 19, 12, 56, 34, 6, 77, 90, 23, 65, 45, 50, 89, 73, 65, 51, 4, 16, 21};

        bubbleSort(array);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
