package org.example.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box {

    public static void sweetBox(Sweet[] sweets) {

            double totalWeight = 0;
            double totalCost = 0;

            for (Sweet sweet : sweets) {
                totalWeight += sweet.getWeight();
                totalCost += sweet.getCost();
                System.out.println(sweet);
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("Общий вес подарка: " + totalWeight + " грамм");
            System.out.println("Общая стоимость подарка: " + totalCost + " рублей");
        }
}

