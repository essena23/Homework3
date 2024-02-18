public class Main {
    public static void main(String[] args) {
        int a = 150000;
        byte b = -14;
        long c = 35489478556548789L;
        float d = 5.894f;
        double e = 16489.8974224489321;
        System.out.println("Значение переменной a c типом int равно " + a);
        System.out.println("Значение переменной b c типом byte равно " + b);
        System.out.println("Значение переменной c c типом long равно " + c);
        System.out.println("Значение переменной d c типом float равно " + d);
        System.out.println("Значение переменной e c типом int равно " + e);

        float f = 27.12f;
        long g = 987678965549L;
        float h = 2.786f;
        int i = 569;
        int j = -159;
        short k = 27897;
        byte l = 67;

        int lP = 23;
        int aS = 27;
        int eA = 30;
        int paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (lP + aS + eA) + " листов бумаги.");

        int productivity2Min = 16;
        int pr1Min = productivity2Min / 2;
        int month = 30;
        System.out.println("За 20 минут машина произвела " + pr1Min * 24 * 60 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + pr1Min * 24 * 60 * 3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " + pr1Min * 24 * 60 * month + " штук бутылок.");

        int paint = 120;
        byte whitePaintForClass = 2;
        byte brownPaintForClass = 4;
        int classes = paint / (whitePaintForClass + brownPaintForClass);
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaintForClass * classes + " банок белой краски и " + brownPaintForClass * classes + " банок коричневой краски.");

        int bananas = 5 * 80;
        int milkMl = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int breakfast = bananas + milkMl + iceCream + eggs;
        float breakfastKg = (float) breakfast / 1000;
        System.out.println("Завтрак спортсмена весит " + breakfast + " граммов или " + breakfastKg + " килограмм.");

        int weightLose = 7 * 1000;
        int minLose = 250;
        int maxLose = 500;
        System.out.println("Спортсмену потребуется " + weightLose / minLose + " дней, если в день он будет терять " + minLose + " грамм.");
        System.out.println("Спортсмену потребуется " + weightLose / maxLose + " дней, если в день он будет терять " + maxLose + " грамм.");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float rise = 0.1f;
        float mNew = masha * (float) rise + masha;
        float dNew = denis * (float) rise + denis;
        float kNew = kristina * (float) rise + kristina;
        System.out.println("Маша теперь получает " + mNew + " рублей. Годовой доход вырос на " + masha * rise * 12 + " рублей.");
        System.out.println("Денис теперь получает " + dNew + " рублей. Годовой доход вырос на " + denis * rise * 12 + " рублей.");
        System.out.println("Кристина теперь получает " + kNew + " рублей. Годовой доход вырос на " + kristina * rise * 12 + " рублей!");





    }
}