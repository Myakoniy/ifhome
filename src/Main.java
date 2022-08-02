public class Main {
    public static void main(String[] args) {

        //условные операторы

        //Zadanie 1

        System.out.println("Zadanie 1");
        int clientOS = 0;

        if (clientOS == 0) {

            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }



        //Zadanie 2

        System.out.println("Zadanie 2");

        int clientOSi = 1;
        int teleAge = 2015;

        if (clientOSi == 0 && teleAge >= 2015) {

            System.out.println("Установите версию приложения для iOS по ссылке");

        }
        if (clientOSi == 0 && teleAge < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }

        if (clientOSi == 1 && teleAge >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }

        if (clientOSi == 1 && teleAge < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        //Zadanie 3

        System.out.println("Zadanie 3");

        int year = 2021;

        if ( year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("год не является високосным");
        }   else {
            System.out.println("Год является вискокосным");
        }

        //Zadanie 4

        System.out.println("Zadanie 4");

        int deliveryDistance = 10;


        if (deliveryDistance < 20) {
            System.out.println("Ваша карта будет доставлена в течение суток");
        }

        if (deliveryDistance >=20 &&  deliveryDistance <60) {
            System.out.println("Ваша карта будет доставлена в течение двух суток");
        }

        if (deliveryDistance >=60 &&  deliveryDistance <100) {
            System.out.println("Ваша карта будет доставлена в течение трех суток");
        }


        //Zadanie 5

        System.out.println("Zadanie 5");

        int monthNumber = 11;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима, одевайся теплее");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна - пора любви, но одиночество у меня в крови");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето - худеть уже поздно");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень - лучшее время для депрессии");
                break;

            default:
                System.out.println("В году всего 12 месяцев!");
        }



    }
}

