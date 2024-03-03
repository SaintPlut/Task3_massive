package org.example.task2;

public class Candy extends Sweet {
    public Candy(String name, double weight, double cost, int parameter) {
        super(name, weight, cost, parameter);
    }

    @Override
    public String toString() {
        System.out.println("-----------------------------------------------------------");
        return "Конфеты: " + getName() + ", Вес: " + getWeight() + " грамм, Цена: " + getCost() + " рублей, Параметр: " + getParameter();
    }
}
