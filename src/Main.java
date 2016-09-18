//  19/09/2016
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;


    public class Main {


        public static class Metods{



            public Double summation(double n1,double n2){ //сложение
                double n3 = n1+n2;
                return n3;
            }

            public Double subtraction(double n1,double n2){ //вычитание
                double n3 = n1 - n2;
                return n3;
            }
            public Double multiply(double n1,double n2){  //умножение
                double n3 = n1 *n2;
                return n3;
            }
            public Double divide(double n1,double n2){  //деление
                double n3 = n1 /n2;
                return n3;
            }
        /*
        public Double exponentiation(double n1,double n2){  //возведение в степень
            double n3=1;
            if(n2>0){
            for(int i=0;i<n2;i++){n1=n1*n1;}
            n3=n1;}
            else if(n2==0){n3=1;}
            else if(n2<0){ for(int i=0;i<(-n2);i++){n1=n1*n1;}

            }
            return n3;
        }

        public Double rooting(double n1,double n2){  //извлечение корня
            double n3;
            for(int i=0;i<n2;i++){n1=n1/n1;}
            n3=n1;
            return n3;
        }   */

        }

        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
            Double number2 = null;
            while (numpass) {
                try {
                    String number1 = reader.readLine();

                    number2 = Double.parseDouble(number1);
                    if (number2 > 7 || number2 < 1) {
                        System.out.println("Номер должен быть от 1 до 7");
                    } else {
                        numpass = false;
                    }

                } catch (Exception e) {
                    System.out.println("Вводить нужно номер операции");
                }

            }
            if (number2 == 7) {System.out.println("Выход");}
            else{System.out.println("АРаспельшики!!!!");}

        }

    }


