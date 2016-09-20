package com.github.zigfrei.epam_training_app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 19.09.2016.
 */
public class Calc {
    public class Metods {


        public Double summation(double n1, double n2) { //сложение
            double n3 = n1 + n2;
            return n3;
        }

        public Double subtraction(double n1, double n2) { //вычитание
            double n3 = n1 - n2;
            return n3;
        }

        public Double multiply(double n1, double n2) {  //умножение
            double n3 = n1 * n2;
            return n3;
        }

        public Double divide(double n1, double n2) {  //деление
            double n3 = n1 / n2;
            return n3;
        }

        public Double exponentiation(double n1,double n2){  //возведение в степень
          double n3 = Math.pow(n1,n2);
            return n3;
        }

        public Double rooting(double n1){  //извлечение корня
           double n2=2;
            double n3=Math.pow(n1,1/n2);
            return n3;
        }

    }

    public void startCalculation() {

        Metods metods = new Metods();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean calcExit = true;
        while (calcExit) {
            System.out.println("Выберите нужную вам операцию:");
            System.out.println("1.Сложение");
            System.out.println("2.Вычитание");
            System.out.println("3.Умножение");
            System.out.println("4.Деление");
            System.out.println("5.Возведение в степень");
            System.out.println("6.Квадратный корень");
            System.out.println("7.Выход из программы");
            System.out.println("Введите номер операции:");


            //Введение номера + проверка
            boolean numpass = true;
            int choise1 = 7;
            while (numpass) {
                try {
                    String number1 = reader.readLine();

                    choise1 = Integer.parseInt(number1);
                    if (choise1 > 7 || choise1 < 1) {
                        System.out.println("Номер должен быть от 1 до 7");
                    } else {
                        numpass = false;
                    }

                } catch (Exception e) {
                    System.out.println("Вводить нужно номер операции");
                }

            }

                numpass = true;
                double number1 = 0;
                double number2 = 0;
                                        //Выбор операции с последущей реализацией
                switch (choise1) {
                    case 1:
                        while (numpass) {
                            System.out.println("Введите первое слогаемое, затем второе");
                            try {
                                number1 = Double.parseDouble(reader.readLine());
                                number2 = Double.parseDouble(reader.readLine());
                            } catch (IOException e) {
                                System.out.println("Неверный ввод данных, попробуйте снова.");
                            }

                            System.out.printf("Ответ:%f\n", metods.summation(number1, number2));
                            numpass = false;
                        }
                        break;

                    case 2:
                            while (numpass) {
                                System.out.println("Введите первое вычитаемое, затем второе");
                                try {
                                    number1 = Double.parseDouble(reader.readLine());
                                    number2 = Double.parseDouble(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Неверный ввод данных, попробуйте снова.");
                                }

                                System.out.printf("Ответ:%f\n", metods.subtraction(number1, number2));
                                numpass = false;
                            }
                            break;

                    case 3:
                            while (numpass) {
                                System.out.println("Введите перввй множитель, затем второй");
                                try {
                                    number1 = Double.parseDouble(reader.readLine());
                                    number2 = Double.parseDouble(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Неверный ввод данных, попробуйте снова.");
                                }

                                System.out.printf("Ответ:%f\n", metods.multiply(number1, number2));
                                numpass = false;
                            }
                            break;

                    case 4:
                            while (numpass) {
                                System.out.println("Введите делимое, затем делитель");
                                try {
                                    number1 = Double.parseDouble(reader.readLine());
                                    number2 = Double.parseDouble(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Неверный ввод данных, попробуйте снова.");
                                }

                                System.out.printf("Ответ:%f\n", metods.divide(number1, number2));
                                numpass = false;
                            }
                            break;

                    case 5:
                            while (numpass) {
                                System.out.println("Введите число, затем степень");
                                try {
                                    number1 = Double.parseDouble(reader.readLine());
                                    number2 = Double.parseDouble(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Неверный ввод данных, попробуйте снова.");
                                }

                                System.out.printf("Ответ:%f\n", metods.exponentiation(number1, number2));
                                numpass = false;
                            }
                            break;
                    case 6:
                            while (numpass) {
                                System.out.println("Введите число для извлечения квадратного корня");
                                try {
                                    number1 = Double.parseDouble(reader.readLine());
                                } catch (IOException e) {
                                    System.out.println("Неверный ввод данных, попробуйте снова.");
                                }

                                System.out.printf("Ответ:%f\n", metods.rooting(number1));
                                numpass = false;
                            }
                            break;
                    case 7:
                            System.out.println("Выход");calcExit =false;
                        break;
                }
            }
        }
    }

