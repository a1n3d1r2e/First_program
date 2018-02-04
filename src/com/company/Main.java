package com.company;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
//	char choice, correct;
//        do {
//            System.out.println("Здравствуйте, вас приветствует программа для работы с отрезками");
//            System.out.println("1.Ввести координаты отрезка");
//            System.out.println("2.Доступные отрезки");
//            System.out.println("3. Операции над отрезками");
//            System.out.println("q  - вызод из программы");
//            choice=(char) System.in.read();
//            do
//                {
//                    correct=(char) System.in.read();
//                }while (correct!='\n');
//    }while (choice<'5' | choice =='q');

        line a=new line(1, 1, 2, 2, "a");
        line b=new line(2, 2, 1, 3, "a");
        boolean f=a.intersections(b);
        System.out.println(f);



    }
}
