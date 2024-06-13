package lesson1;

public class HW22 {

    public static void main(String[] args) {
        int[] masiv = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Парные положительные числа:");
            for (int i = 0; i < masiv.length; i++) {
                if (masiv[i] > 0 && masiv[i] % 2 == 0) {
                    System.out.println(masiv[i]);
                }
            }
        }
    }
