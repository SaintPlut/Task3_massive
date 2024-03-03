package org.example.task2;

public class Jelly extends Sweet {
    public Jelly(String name, double weight, double cost, int parameter) {
        super(name, weight, cost, parameter);
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------------------------------");
        return "Желейная сладость: " + getName() + ", Вес: " + getWeight() + " грамм, Цена: " + getCost() + " рублей, Параметр: " + getParameter();

    }
}
