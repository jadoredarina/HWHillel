package lesson1;

public class Main {
    public static void main(String[] args) {
        int[] masiv = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int sum = 0;
        for (int i = 0; i < masiv.length; i++) {
            if (masiv[i] > 5 && masiv[i] < 45) {
                sum = sum + masiv[i];
            }
        }
        System.out.println("Сумма чисел больше 5 и меньше 45: " + sum);
    }
}

