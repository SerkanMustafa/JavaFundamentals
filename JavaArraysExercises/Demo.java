package JavaArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[4];

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.println();

        //variant 2
        String[] names2 = scanner.nextLine().split(" ");

        //int array

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        //int array -> console read

        int[]numbers2= Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(value ->Integer.parseInt(value))
                .toArray();
//variant 2 arrays <- ints console read
        int[]numbers3= Arrays.stream(scanner.nextLine()
                .split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
