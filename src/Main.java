public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("   Задача 1");
        int i = 2147483647;
        System.out.println(i);
        byte b = 127;
        System.out.println(b);
        short s = 32767;
        System.out.println(s);
        long l = 922337L;
        System.out.println(l);
        float f = 27.55f;
        System.out.println(f);
        double d = 4.343;
        System.out.println(d);

        // Задача 2
        System.out.println("   Задача 2");
        float f1 = 27.12f;
        System.out.println(f1);
        long l1 = 987678965549L;
        System.out.println(l1);
        double d1 = 2.786;
        System.out.println(d1);
        boolean bl1 = false;
        System.out.println(bl1);
        short s1 = 569;
        System.out.println(s1);
        int i1 = 27897;
        System.out.println(i1);
        byte b1 = 67;
        System.out.println(b1);

        // Задача 3
        System.out.println("   Задача 3");
        short class1 = 23;
        short class2 = 27;
        short class3 = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (class1 + class2 + class3) + " листов бумаги");

        // Задача 4
        System.out.println("   Задача 4");
        int bottlePer2Min = 16;
        int bottlePerMin = bottlePer2Min / 2;
        int time20Min = 20;
        System.out.println("За 20 мин машина произвела " + bottlePerMin * time20Min + " бутылок");
        int time1Day = 1440;
        System.out.println("За 1 день машина произвела " + bottlePerMin * time1Day + " бутылок");
        int time3Day = time1Day * 3;
        System.out.println("За 3 дня машина произвела " + bottlePerMin * time3Day + " бутылок");
        int time1Mounth = time1Day * 30;
        System.out.println("За 1 месяц машина произвела " + bottlePerMin * time1Mounth + " бутылок");

        //Задача 5
        System.out.println("   Задача 5");
        byte totalPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        System.out.println("В школе, где " + totalPaint / (whitePaintPerClass + brownPaintPerClass) + " классов, нужно " + totalPaint / (whitePaintPerClass + brownPaintPerClass) * whitePaintPerClass + " банок белой краски и " + totalPaint / (whitePaintPerClass + brownPaintPerClass) * brownPaintPerClass + " банок коричневой краски");

        //Задача 6
        System.out.println("   Задача 6");
        float bananWeight = 80;
        float milk100MlWeight = 105;
        float iceCreamWeight = 100;
        float eggWeight = 70;
        System.out.println((bananWeight * 5 + milk100MlWeight * 2 + iceCreamWeight * 2 + eggWeight * 4) / 1000);

        //Задача 7
        System.out.println("   Задача 7");
        short needToLose = 7000;
        short losePerDay1 = 250;
        short losePerDay2 = 500;
        System.out.println("Если спортсмен будет терять " + losePerDay1 + " гр за день, то он похудеет за " + needToLose / losePerDay1 + " дней, а если 500 гр, то за " + needToLose / losePerDay2 + " дней. В среднем на похудение ему понадобится " + needToLose / ((losePerDay1 + losePerDay2) / 2) + " дней");

        //Задача 8
        System.out.println("   Задача 8");
        float mashaWage = 67760;
        System.out.println("Маша теперь получает " + (mashaWage + mashaWage / 100 * 10) + " рублей в месяц. Годовой доход вырос на " + mashaWage / 100 * 10 * 12 + " рублей");
        float denisWage = 83690;
        System.out.println("Денис теперь получает " + (denisWage + denisWage / 100 * 10) + " рублей в месяц. Годовой доход вырос на " + denisWage / 100 * 10 * 12 + " рублей");
        float cristinaWage = 76230;
        System.out.println("Кристина теперь получает " + (cristinaWage + cristinaWage / 100 * 10) + " рублей в месяц. Годовой доход вырос на " + cristinaWage / 100 * 10 * 12 + " рублей");
    }
}