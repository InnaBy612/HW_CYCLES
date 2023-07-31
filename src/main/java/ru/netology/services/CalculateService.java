package ru.netology.services;

public class CalculateService {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
//отдых
                money = money - expenses;
                money = money / 3;
                counter++;
            } else {
//работа
                money = money + income;
                money = money - expenses;
            }
        }

        return counter;
    }
}
