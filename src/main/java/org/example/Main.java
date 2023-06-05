package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        zadacha1();
    }

    public static void zadacha1() {
        Scanner in = new Scanner(System.in);
        int earings = 0;
        int spendings = 0;

        while (true) {
            System.out.println("Список операций:");
            System.out.println("1.Ввести сумму доходов");
            System.out.println("2.Ввести сумму расходов");
            System.out.println("3.Выбрать систему налогооблажения");
            System.out.println("Введите номер операции");
            String input = in.nextLine();

            if ("end".equals(input)) {
                System.out.println("Программа завершена");
                break;
            }

            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода: ");
                    String moneystr = in.nextLine();
                    int money = Integer.parseInt(moneystr);

                    earings += money;
                    System.out.println("Доходы: " + earings);
                    break;
                case 2:
                    System.out.println("Введите сумму расходов: ");
                    String spenstr = in.nextLine();
                    int spen = Integer.parseInt(spenstr);
                    spendings += spen;
                    System.out.println("Расходы: " + spendings);
                    break;
                case 3:
//                    double USN = earings * 0.06;
                    System.out.println("Налог УСН доходы: " + USN(earings));
//                    double USN2 = (earings - spendings) * 0.15;
                    System.out.println("Налог УСН доходы-расходы: " + USN2(earings,spendings));

                    if (USN(earings)<USN2(earings,spendings)){
                        System.out.println("Система УСН доходы выгоднее");
                        System.out.println("Экономия: " + (USN2(earings,spendings) - USN(earings)));
                        break;
                    }
                    else {

                        System.out.println("Система УСН доходы-расходы выгоднее");
                        System.out.println("Экономия: " + (USN(earings) - USN2(earings,spendings)));
                        break;
                    }

//                    if (USN < USN2) {
//                        System.out.println("Система УСН доходы выгоднее");
//                        System.out.println("Экономия: " + (USN2 - USN));
//                        break;
//                    } else {
//                        System.out.println("Система УСН доходы-расходы выгоднее");
//                        System.out.println("Экономия: " + (USN - USN2));
//                        break;
//                    }
            }
        }


    }
    public static int USN2(int earings, int spendings){
        int USN2 = (int) ((earings - spendings) * 0.15);
        if (USN2>=0){

            return USN2;

        }else{
            return 0;
        }
    }
    public static int USN(int earings){
        int USN = (int) (earings * 0.06);
        if (USN>=0){

            return USN;
        }else{
            return 0;
        }
    }

    public static void zadacha2(){

        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.println("Список операций:");
            System.out.println("1.Сравнить");
            System.out.println("2.Округлить");
            System.out.println("3.Отбросить дробную часть");
            System.out.println("Введите номер операции");
            String input = in.nextLine();
            int operation = Integer.parseInt(input);
            if ("end".equals(input)) {
                System.out.println("Программа завершена");
                break;
            }

            switch (operation){
                case 1:
                    System.out.println("Введите первое число:");
                    String first1str = in.nextLine();
                    double first1 = Double.parseDouble(first1str);
                    System.out.println("Введите второе число:");
                    String second1str = in.nextLine();
                    float second1 = Float.parseFloat(second1str);
                    if (first1==second1) {
                        System.out.println("Числа равны");
                        break;
                    }else{
                        System.out.println("Числа не равны");
                        break;
                    }
                case 2:
                    System.out.println("Введите первое число:");
                    String first2str = in.nextLine();
                    double first2 = Double.parseDouble(first2str);
                    System.out.println("Введите второе число:");
                    String second2str = in.nextLine();
                    float second2 = Float.parseFloat(second2str);
                    System.out.println("Округление:");
                    System.out.println("1)"+Math.round(first2)+" 2)"+Math.round(second2));
                    break;
                case 3:
                    System.out.println("Введите первое число:");
                    String first3str = in.nextLine();
                    double first3 = Double.parseDouble(first3str);
                    System.out.println("Введите второе число:");
                    String second3str = in.nextLine();
                    float second3 = Float.parseFloat(second3str);
                    System.out.println("Отбросил дробную часть");
                    long firs = (long)first3;
                    long secon = (long)second3;
                    System.out.println(firs+" "+secon);
                    break;
            }
        }
    }
}