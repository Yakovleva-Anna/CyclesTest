package ru.netology.services;

public class VacationService {
    public int calculate(int income /*заработал*/, int expense /*потратил*/, int threshold/*нужно денег для отдыха*/) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expense) / 3;
                continue;
            }
            money = money + income - expense;
        }
        return count;
    }
}
