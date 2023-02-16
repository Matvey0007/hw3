public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }




    public static void task1 () {
        System.out.println("Задача 1");
        byte kofe1 = 110;
        short kofe2 = 29093;
        int kofe3 = 1909090909;
        long kofe4 = 209090909098990L;
        float kofe5 = 3.14f;
        double kofe6 = 1.5809;

        System.out.println("Значение переменной kofe1 c типом byte  равно " + kofe1);
       System.out.println("Значение переменной kofe2 c типом sort равно " + kofe2);
       System.out.println("Значение переменной kofe3 c типом int  равно " + kofe3);
       System.out.println("Значение переменной kofe4 c типом long  равно " + kofe4);
       System.out.println("Значение переменной kofe5 c типом float  равно " + kofe5);
       System.out.println("Значение переменной kofe6 c типом double  равно " + kofe6);


    }
    public static void task2(){
        float tea1 = 27.12f;
        long tea2 = 987678965549L;
        double tea3 = 2.786;
        short tea4 = 569;
        short tea5 = -159;
        int tea6 = 27897;
        byte tea7 = 67;

        System.out.println("Значение переменной tea7 c типом byte  равно " + tea7);
        System.out.println("Значение переменной tea5 c типом short равно " + tea5);
        System.out.println("Значение переменной tea6 c типом int  равно " + tea6);
        System.out.println("Значение переменной tea2 c типом long  равно " + tea2);
        System.out.println("Значение переменной tea1 c типом float  равно " + tea1);
        System.out.println("Значение переменной tea3 c типом double  равно " + tea3);
        System.out.println("Значение переменной tea4 c типом short  равно " + tea4);

    }
    public static void task3(){
       char aClass = 23;
       char bClass = 27;
       char cClass = 30;
       int list = 480;
       int summChild = aClass + bClass + cClass;
       int listChild = list/ summChild;
       System.out.println("На каждого ученика расчитано "+ listChild + " листов бумаги");

}
    public static  void task4(){
       byte bootle  = 8;
       int timeBottle = 20;
       int kollBottle = bootle*timeBottle;
        System.out.println("за " +timeBottle +  " минут машина произвела " + kollBottle + " штук бутылок");
        int time =24;
        int bottleHours = 480;
        int bottleDay = time * bottleHours;
         System.out.println("за " +time +  " часа  машина произвела " + bottleDay + " штук бутылок");
         int time1 = time * 3;
         int bottleDay1 = time1 * bottleHours;
         int time2 = time1/time;
        System.out.println("за " +time2 +  " дня  машина произвела " + bottleDay1 + " штук бутылок");
        int mont = time*30;
        int day = mont/720;
        System.out.println("за " + day +  " месяц  машина произвела " + bottleDay + " штук бутылок");



}

    public static void task5(){
        short bananKol = 5;
        short bananVes = 80;
        short milkKol = 2;
        short milkVes = 105;
        short iceKol = 2;
        short iceVes = 100;
        short eggKol = 4;
        short eggVes = 70;
        int vesZavtrak = bananVes * bananKol + milkVes * milkKol + iceVes * iceKol + eggVes * eggKol;
        System.out.println("вес завтрака " + vesZavtrak + " грамм ");
        float vesZav = vesZavtrak/1000f;
        System.out.println("вес завтрака "+ vesZav + " килограм");


}
    public static void  task6(){
        short banKras = 120;
        short krasWithe = 2;
        short krasBrown = 4;
        int clasKras = krasBrown + krasWithe;
        int kollClass = banKras / clasKras;
        int klassWithe = krasWithe * kollClass;
        int klassBrown = krasBrown * kollClass;

        System.out.println("В школе, где " + kollClass+" классов, нужно " + klassWithe+ " банок белой краски и " + klassBrown+ " банок коричневой краски.");
    }

    public static void task7(){
        short ves = 7;
        float vesDay = 0.25f;
        float vesDay1 = 0.5f;
        float day = ves / vesDay;
        float day1 = ves / vesDay1;
        System.out.println( day+ " дней уйдет на похудение");
        System.out.println( day1+ " дней уйдет на похудение");

    }


    public static void task8(){
        int zpMasha = 67760;
        int zpDen = 83690;
        int zpKris = 76230;
        double povMasha = zpMasha * 0.1;
        double povDen = zpDen * 0.1;
        double povKris = zpKris * 0.1;
        double zpMashaMes = zpMasha + povMasha;
        double zpDenMes = zpDen + povDen;
        double zpKrisMes = zpKris + povKris;
        System.out.println("Маша теперь получает " + zpMashaMes + " рублей");
        System.out.println("Денис теперь получает " + zpDenMes + " рублей");
        System.out.println("Кристина теперь получает " + zpKrisMes + " рублей");
        double zpMashaYear = povMasha * 12;
        double zpDenYear = povDen * 12;
        double zpKrisYear = povKris * 12;
        System.out.println("Годовой доход Маши вырос на "+ zpMashaYear+ " рублей");
        System.out.println("Годовой доход Дениса вырос на "+ zpDenYear+ " рублей");
        System.out.println("Годовой доход Кристины вырос на "+ zpKrisYear+ " рублей");




    }
}