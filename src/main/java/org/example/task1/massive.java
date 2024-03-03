package org.example.task1;

import java.util.Random;

public class massive {
    public static void workMassive()
    {
        int[] array = new int[20];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21) - 10;
        }

        int maxNegative = 0;
        int minPositive = Integer.MAX_VALUE;

        System.out.println("Элементы массива");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] < maxNegative) {
                maxNegative = array[i];
            }
            if (array[i] > 0 && array[i] < minPositive) {
                minPositive = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальный отрицательный элемент: " + maxNegative);
        System.out.println("Минимальный положительный элемент: " + minPositive);

        int temp = maxNegative;
        maxNegative = minPositive;
        minPositive = temp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNegative) {
                array[i] = minPositive;
            } else if (array[i] == minPositive) {
                array[i] = maxNegative;
            }
        }
        System.out.println("Элементы массива после изменений");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
