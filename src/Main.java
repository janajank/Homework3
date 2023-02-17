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
        System.out.println("Задача1");
        byte rubles = 100;
        short yuan = 1200;
        int euro = 30000;
        long dollars = 500000000L;
        float rupees = 4.5f;
        double dinars = 85.55;
        System.out.println(rubles+" "+yuan+" "+euro+" "+dollars+" "+rupees+" "+dinars);
    }

    public static void task2 () {
        System.out.println("Задача2");
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.786f;
        short s = 569;
        short x = -159;
        int i = 27897;
        byte b = 67;
    }

    public static void task3 () {
        System.out.println("Задача3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short paper = 480;
        int pupils = LP + AS + EA;
        int sheets = paper / pupils;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги.");

    }

    public static void task4 () {
        System.out.println("Задача4");

        byte a = 2;
        byte b = 20;
        short c = 1440;
        short d = 4320;
        int e = 43200;
        byte productivityA = 16;
        int productivityB = b*productivityA/a;
        int productivityC = (c*productivityA)/a;
        int productivityD = d*productivityA/a;
        int productivityE = e*productivityA/a;
        System.out.println("За 20 минут машина произвела " + productivityB + " штук бутылок.");
        System.out.println("За сутки машина произвела " + productivityC + " штук бутылок."  );
        System.out.println("За 3 дня машина произвела " + productivityD + " штук бутылок.");
        System.out.println("За месяц машина произвела " + productivityE + " штук бутылок."  );

    }

    public static void task5 () {
        System.out.println("Задача5");
        byte canAmount = 120;
        byte whiteCan = 2;
        byte brownCan = 4;
        int room = whiteCan + brownCan;
        int roomAmount = canAmount/room;
        int white = whiteCan*roomAmount;
        int brown = brownCan*roomAmount;
        System.out.println("В школе,где " + roomAmount + " классов, нужно " +  white + " банок белой краски и " + brown
                + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println("Задача6");
        byte banana = 80;
        byte bananaAmount = 5;
        byte milk = 105;
        short milkAmount = 2;
        byte iceCream = 100;
        byte iceCreamAmount = 2;
        byte egg = 70;
        byte eggAmount = 4;
        int ingridient1 = banana * bananaAmount;
        int ingridient2 = milk * milkAmount;
        int ingridient3 = iceCream * iceCreamAmount;
        int ingridient4 = egg * eggAmount;
        int mealWeight1 = ingridient1 + ingridient2 +ingridient3+ingridient4;
        float mealWeight2 = mealWeight1/1000f;
        System.out.println(mealWeight1+" г");
        System.out.println(mealWeight2+" кг");

    }

    public static void task7 () {
        System.out.println("Задача7");
        byte weight = 7;
        float weightLost1 = 0.25f;
        float weightLost2 = 0.5f;
        float time1 = weight/weightLost1;
        float time2 = weight/weightLost2;
        float middleTime = (time1+time2)/2;
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(middleTime);

    }
    public static void task8 () {
        System.out.println("Задача8");
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int newSalaryM = Masha+6776;
        int newSalaryD = Denis+8369;
        int newSalaryK = Kristina+7623;
        int yearAdditionM = 6776*12;
        int yearAdditionD = 8369*12;
        int yearAdditionK = 7612*12;
        System.out.println("Маша теперь получает "+newSalaryM+" рублей.Годовой доход вырос на "+yearAdditionM+" рублей.");
        System.out.println("Денис теперь получает "+newSalaryD+" рублей.Годовой доход вырос на "+yearAdditionD+" рублей.");
        System.out.println("Кристина теперь получает "+newSalaryK+" рублей.Годовой доход вырос на "+yearAdditionK+" рублей.");

    }
}