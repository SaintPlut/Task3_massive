package org.example.task2;

public class Sweet {
    private String name;
    private double weight;
    private double cost;
    private int parameter;

    public Sweet(String name, double weight, double cost, int parameter) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.parameter = parameter;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public int getParameter() {
        return parameter;
    }

    @Override
    public String toString() {
        return "Сладость: " + name + ", Вес: " + weight + " грамм, Цена: " + cost + " рублей, Параметр: " + parameter;
    }
}




