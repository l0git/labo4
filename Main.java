package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элеметов массива:");
        int x = scanner.nextInt();
        int[] matrix = new int[x];
        int y = 0;
        for (int i = 0; i <= (x-1); i++){
            System.out.println("Введите число с " + i + " индексом:");
            matrix[i] = scanner.nextInt();
            y += matrix[i];
        }
        System.out.println("Ваш массив: " + Arrays.toString(matrix));

        int min = matrix[0];

        for (int i = 1; i < x; i++) {
            if (matrix[i] < min)

                min = matrix[i];
        }
        System.out.println("Мин значение массива: " + min);
        System.out.println("Среднее арифметическое: " + (y/x));
        System.out.println("Сумма мин знчения массива и среднего арифметического числа: " + (min + (y/x)));

    }
}
