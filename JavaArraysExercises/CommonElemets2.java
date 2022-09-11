package JavaArraysExercises;

import java.util.Scanner;

public class CommonElemets2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String s : secondArray) {
            for (String first : firstArray) {
                if (s.equals(first)){
                    System.out.println(first+" ");
                }
            }
        }
        for (int i = 0; i < secondArray.length; i++) {

        }
    }
}
