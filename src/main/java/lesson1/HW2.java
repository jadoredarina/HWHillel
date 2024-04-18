package lesson1;

public class HW2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5 && array[i] < 45) {
                sum += array[i];
            }
        }
        System.out.println("Сумма чисел больше 5 и меньше 45: " + sum);

        System.out.println("Парные положительные числа:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}