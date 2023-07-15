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

    public static void task1() {
        System.out.println("Задача номер 1");
        int a = 67;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 85;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 1000;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 5555555;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 2.456f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 67.875;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача номер 2");
        System.out.println("Задача номер 1");
        int a = 27897;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 67;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 569;
        System.out.println("Значение переменной c с типом short равно " + c);
        short g = -159;
        System.out.println("Значение переменной g с типом short равно " + g);
        long d = 987678965549L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 27.12f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 2.786;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task3() {
        System.out.println("Задача номер 3");
        int ludmilasStudents = 23;
        int annasStudents = 27;
        int ekaterinasStudents = 30;
        int paper = 480;
        int allStudents = ludmilasStudents + annasStudents + ekaterinasStudents;
        int studentsPaper = paper / allStudents;
        System.out.println("На каждого ученика расчитанно " + studentsPaper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача номер 4");
        int bottlesForTwoMinutes = 16;
        int bottlesForOneMinutes = bottlesForTwoMinutes / 2;
        int bottlesForTwentyMinutes = bottlesForOneMinutes * 20;
        int bottlesForOneDay = bottlesForOneMinutes * 60 * 24;
        int bottlesForThreeDays = bottlesForOneDay * 3;
        int bottlesForOneMouth = bottlesForThreeDays * 10;
        System.out.println("За 20 минут машина произвела " + bottlesForTwentyMinutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + bottlesForOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesForThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesForOneMouth + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача номер 5");
        int pots = 120;
        int whitePots = 2;
        int brownPots = 4;
        int brownAndWhitePots = whitePots + brownPots;
        int numberOfTheClasses = pots / brownAndWhitePots;
        int whitePotsForTheClasses = numberOfTheClasses * whitePots;
        int brownPotsForTheClasses = numberOfTheClasses * brownPots;
        System.out.println("В школе, где " + numberOfTheClasses + " классов, нужно " + whitePotsForTheClasses + " банок белой краски и " + brownPotsForTheClasses + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача номер 6");
        int oneBananasOfGrams = 80;
        int fiveBananasOfGrams = oneBananasOfGrams*5;
        int oneHundredMlOfMilkGr= 105;
        int everyGrOfMilk= oneHundredMlOfMilkGr*2;
        int oneIceCreamGr=100;
        int everyGrOfIceCream=oneIceCreamGr*2;
        int oneEggsOfGrams = 70;
        int fiveEggsOfGrams = oneEggsOfGrams*4;
        int fullEightOfGrams = fiveBananasOfGrams+everyGrOfMilk+everyGrOfIceCream+fiveEggsOfGrams;
        int weightOfGram = 1090;
        float weightOfKilogram = weightOfGram/1000f;
        System.out.println("Один из видов завтрака для спортсмена содержит в себе "+ weightOfGram+" грамм "+", либо "+weightOfKilogram+" килограммов еды" );


    }

    public static void task7() {
        System.out.println("Задача номер 7");
        int weightKg = 7;
        int weightKgToGr= weightKg*1000;
        int gr1=250;
        int gr2=500;
        int success1=weightKgToGr/gr1;
        int success2=weightKgToGr/gr2;
        System.out.println("В первом случае для похудения спортсмену нужно " + success1+" дней, а во втором " + success2+" дней");
    }

    public static void task8() {
        System.out.println("Задача номер 8");
        int mashasSalary= 67760;
        int tenPercentOfMashasSalary=mashasSalary/10;
        int newMashasSalary= mashasSalary+tenPercentOfMashasSalary;
        int mashasSalaryForYear = mashasSalary*12;
        int newMashasSalaryForYear= newMashasSalary*12;
        int differenceOfSalary= newMashasSalaryForYear%mashasSalaryForYear;
        System.out.println("Маша теперь получает "+newMashasSalary+ " рублей. Годовой доход вырос на "+differenceOfSalary+" рублей");

        int denisesSalary= 83690;
        int tenPercentOfDenisesSalary =denisesSalary/10;
        int newDenisesSalary= denisesSalary+tenPercentOfDenisesSalary;
        int denisesSalaryForYear = denisesSalary*12;
        int newDenisesSalaryForYear= newDenisesSalary*12;
        int differenceOfDenisSalary= newDenisesSalaryForYear%denisesSalaryForYear;
        System.out.println("Денис теперь получает "+newDenisesSalary+ " рублей. Годовой доход вырос на "+differenceOfDenisSalary+" рублей");

        int kristinasSalary= 76230;
        int tenPercentOfKristinasSalary=kristinasSalary/10;
        int newKristinasSalary= kristinasSalary+tenPercentOfKristinasSalary;
        int kristinasSalaryForYear = kristinasSalary*12;
        int newKristinasSalaryForYear= newKristinasSalary*12;
        int differenceOfKristinaSalary= newKristinasSalaryForYear%kristinasSalaryForYear;
        System.out.println("Кристина теперь получает "+newKristinasSalary+ " рублей. Годовой доход вырос на "+differenceOfKristinaSalary+" рублей");
    }
}