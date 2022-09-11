package JavaArraysExercises;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotation = Integer.parseInt(scanner.nextLine());

        String[] array = scanner.nextLine().split(" ");

        for (int i = 0; i < rotation; i++) {
            String firstElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElement;
        }
        System.out.println(
        String.join(" ", array));

    }
}
