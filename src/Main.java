import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int salary = 15000;
        int total = 0;
        int days = 0;
        while (total < 2_459_000) {
            total = total + salary;
            days++;
            System.out.println("Месяц " + days + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 2");

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(" " + a);
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(" " + b);
        }
        System.out.println();
        System.out.println("Задача 3");

        int totalPeople = 12_000_000;
        int birthRate = 17 * totalPeople / 1000;
        int mortality = 8 * totalPeople / 1000;
        for (int i = 1; i <= 10; i++) {
            totalPeople = totalPeople + birthRate - mortality;
            System.out.println("год " + i + " численность населения составляет " + totalPeople);
        }
        System.out.println("Задача 4");

        int salary1 = 15000;
        int total1 = 0;
        int month1 = 0;
        while (total1 < 12_000_000) {
            total1 = total1 + salary1;
            total1 = total1 + ((total1 / 100) * 7);
            month1++;
            System.out.println(month1 + " месяц сумма накоплений равна " + total1);
        }
        System.out.println("Задача 5");
        int salary2 = 15000;
        int total2 = 0;
        int month2 = 1;
        for (; total2 < 12_000_000; month2++) {
            total2 = total2 + salary2;
            total2 = total2 + ((total2 / 100) * 7);
            if (month2 % 6 == 0) {
                System.out.println(month2 + " месяц сумма накоплений равна " + total2);
            }
        }
        System.out.println("Задача 6");

        int salary3 = 15000;
        int total4 = 0;
        int year3 = 0;
        while (year3 <= 108) {
            total4 = total4 + salary3;
            total4 = total4 + ((total4 / 100) * 7);
            year3++;
            if (year3 % 6 == 0) {
                System.out.println(year3 + " месяц сумма накоплений равна " + total4);
            }
        }

        System.out.println("Задача 7");

        for (int days5 = 5; days5 <= 31; days5++) {
            if (days5 % 7 == 5) {
                System.out.println("Сегодня пятница " + days5 + " число. Необходимо подготовить отчет");
            }
        }
        System.out.println("Задача 8");
        int year0 = 0;
        int year8 = 2024 - 200;
        int year9 = 2024 + 100;
        for (year0 = year8; year0 < year9; year0++) {
            if (year0 % 79 == 0) {
                System.out.println(year0);
            }
        }



    }
}