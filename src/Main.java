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
            System.out.println("\u0412\u044b\u0431\u0435\u0440\u0438\u0442\u0435 \u043d\u0443\u0436\u043d\u0443\u044e \u0432\u0430\u043c \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u044e:");
            System.out.println("1.\u0421\u043b\u043e\u0436\u0435\u043d\u0438\u0435");
            System.out.println("2.\u0412\u044b\u0447\u0438\u0442\u0430\u043d\u0438\u0435");
            System.out.println("3.\u0423\u043c\u043d\u043e\u0436\u0435\u043d\u0438\u0435");
            System.out.println("4.\u0414\u0435\u043b\u0435\u043d\u0438\u0435");
            System.out.println("5.\u0412\u043e\u0437\u0432\u0435\u0434\u0435\u043d\u0438\u0435 \u0432 \u0441\u0442\u0435\u043f\u0435\u043d\u044c");
            System.out.println("6.\u041a\u0432\u0430\u0434\u0440\u0430\u0442\u043d\u044b\u0439 \u043a\u043e\u0440\u0435\u043d\u044c");
            System.out.println("7.\u0412\u044b\u0445\u043e\u0434 \u0438\u0437 \u043f\u0440\u043e\u0433\u0440\u0430\u043c\u043c\u044b");
            System.out.println("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043d\u043e\u043c\u0435\u0440 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438:");


            //Введение номера + проверка
            boolean numpass = true;
            Double number2 = null;
            while (numpass) {
                try {
                    String number1 = reader.readLine();

                    number2 = Double.parseDouble(number1);
                    if (number2 > 7 || number2 < 1) {
                        System.out.println("\u041d\u043e\u043c\u0435\u0440 \u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c \u043e\u0442 1 \u0434\u043e 7");
                    } else {
                        numpass = false;
                    }

                } catch (Exception e) {
                    System.out.println("\u0412\u0432\u043e\u0434\u0438\u0442\u044c \u043d\u0443\u0436\u043d\u043e \u043d\u043e\u043c\u0435\u0440 \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438");
                }

            }
            if (number2 == 7) {System.out.println("Выход");}
            else{System.out.println("АРаспельшики!!!!");}

        }

    }


