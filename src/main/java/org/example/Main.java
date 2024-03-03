package org.example;

import org.example.task2.Candy;
import org.example.task2.Jelly;
import org.example.task2.Sweet;

import static org.example.task1.massive.workMassive;
import static org.example.task2.Box.sweetBox;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //task1
        //workMassive();

        //---------------------
        //task 2
        System.out.println();

        Sweet[] sweets = {
                new Candy("Chocolate", 100, 1.5, 1),
                new Jelly("JellyWorms", 50, 0.5, 2),
                new Candy("Snigers", 150, 2.0, 3)
        };
        sweetBox(sweets);
    }
}