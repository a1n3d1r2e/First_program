package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
	char choice_main, correct;
        Scanner in=new Scanner(System.in);
        ArrayList<line> lines=new ArrayList<line>();
        do {
            do {
                System.out.println("Здравствуйте, вас приветствует программа для работы с отрезками");
                System.out.println("1.Ввести координаты отрезка");
                System.out.println("2.Доступные отрезки");
                System.out.println("3.Операции над отрезками");
                System.out.println("q  - вызод из программы");
                choice_main = (char) System.in.read();
                do {
                    correct = (char) System.in.read();
                } while (correct != '\n');
            } while (choice_main < '1' || choice_main > '3');

            switch (choice_main) {
                case '1': {
                    double[] x = new double[4];
                    System.out.println("Введите координаты точек");
                    int j = 0;
                    for (int i = 0; i <= 2; i += 2) {
                        System.out.println("Ввведите " + (i - 2 * j) + " коодинату " + (i + 1 - j) + " точки ");
                        x[i] = (int) System.in.read() - 48;
                        do {
                            correct = (char) System.in.read();
                        } while (correct != '\n');
                        System.out.println("Ввведите " + (i + 1 - j) + " коодинату " + (i + 1 - j) + " точки ");
                        j++;
                        x[i + 1] = System.in.read() - 48;
                        do {
                            correct = (char) System.in.read();
                        } while (correct != '\n');
                        System.out.println();
                    }
                    System.out.println("Введите имя отрезка:");
                    String name = in.next();
                    line newline = new line(x[0], x[1], x[2], x[3], name);
                    lines.add(newline);
                    break;

                }
                case '2': {
                    if (lines.isEmpty()) {
                        System.out.println("Отрезков нет");

                    } else {
                        int j = lines.size();
                        System.out.println("В коллекции содержится: " + j + " отрезков. ");
                        for (int i = 0; i < j; i++) {
                            int point = 0;
                            System.out.println(i + " отрезок " + lines.get(i).name + " состоит из точек:");
                            System.out.println(point + " точка, с абциссой: " + lines.get(i).p1.getX() + " ординатой:" +
                                    " " +
                                    lines.get(i).p1.getY());
                            System.out.println((point + 1) + " точка, с абциссой: " + lines.get(i).p2.getX() + " " +
                                    " ординатой: " +
                                    lines.get(i).p2.getY());


                            lines.get(i).getabs();
                            System.out.println("Имеет длинну " + lines.get(i).abs);

                        }
                        System.out.println("Все отрезки выведены на экран");
                    }
                    break;
                }
                case '3':
                    { System.out.println("1.Найти длину");
                    System.out.println("2.Узнать пересекаются ли");
                    System.out.println("3.Вернуться в меню");
                    }
            }
        }while (choice_main!='q');
        System.out.println("Вы вышли из программы");
    }
}
