package ru.geekbrains;

//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

        byte h = -101;
        short j = 28635;
        int k = -1568888;
        long l = 3372036l;

        float t = 1.72f;
        double y = 5.999999;

        char u = '^';

        boolean o = true;


        task_three(1,6,11,2);
        task_four(2, 1);
        task_five(-2);
        task_six(-88);
        task_seven();
        task_eight();
        thanks();

    }
//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;

    public static void task_three(int a, int b, float c, int d)
    {
        float equation = (a * (b + (c / d)));

        System.out.println(equation);
    }

//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean task_four(int first_number, int second_number)
    {
        int summary = first_number + second_number;
        if (summary >= 10 && summary <= 20)
        {
           return true;
        }
        else
        {
           return false;
        }
    }

//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

    public static void task_five(int number)
    {
        if(number >= 0)
        {
            System.out.println("This is a positive integer ");
        }
        else
        {
            System.out.println("This is a negative integer");
        }
    }

//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

    public static boolean task_six(int number)
    {
        if(number < 0)
        {
            return true;
        }
        else
        {
           return false;
        }
    }

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void task_seven()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
    }
//8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void task_eight()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a year");
        int input_year = scan.nextInt();

        if(input_year % 4 == 0 || input_year % 400 == 0 && !(input_year % 400 == 0))
        {
            System.out.println(input_year + "  is a leap year.");
        }
        else
        {
            System.out.println(input_year + " is not a leap year.");
        }
    }

    public static void thanks()
    {
        System.out.println("Prostite za angliyskiy, beda s russkoi raskladkoi :)");
    }
}
