public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();

        int salary = 15_000;
        int total = 0;
        int months = 0;
        while (total < 2_459_000) {
            months++;
            total += total/100;
            total += salary;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Всего потребуется месяцев: " + months);
        System.out.println();
        System.out.println("Задача 2");
        System.out.println();
        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for(;i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Задача 3");
        System.out.println();
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        for (i = 1; i <= 10; i++){
            population += ((population/1000 * birthRate) - (population/1000 * mortalityRate));
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Задача 4");
        System.out.println();
        int contribution = 15_000;
        int percent = 7;
        int contributionSum = 0;//12_500_000
        months = 0;
        while (contributionSum < 12_500_000){
            months++;
            contributionSum += contributionSum / 100 * percent;
            contributionSum += contribution;
            System.out.println("Месяц " + months + ", сумма накоплений " + contributionSum + " рублей");
        }
        System.out.println();
        System.out.println("Задача 5");
        System.out.println();
        contributionSum = 0;
        months = 0;
        while (contributionSum < 12_500_000){
            months++;
            contributionSum += contributionSum / 100 * percent;
            contributionSum += contribution;
            if (months % 6 == 0){
            System.out.println("Месяц " + months + ", сумма накоплений " + contributionSum + " рублей");
        }}
        System.out.println();
        System.out.println("Задача 6");
        System.out.println();
        contributionSum = 0;
        months = 0;
        while (months < (12 * 9)){
            months++;
            contributionSum += contributionSum / 100 * percent;
            contributionSum += contribution;
            if (months % 6 == 0){
                System.out.println("Месяц " + months + ", сумма накоплений " + contributionSum + " рублей");
            }}
        System.out.println();
        System.out.println("Задача 7");
        System.out.println();

        for (int dayFriday = 6;dayFriday <= 31;dayFriday += 7){
            System.out.println("Сегодня пятница, " + dayFriday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();
        System.out.println("Задача 8");
        System.out.println();
//        Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
//        Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
//        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий
//        год ее появления (ближайшие 100 лет).
//        Для вычисления периода можно создать две дополнительные переменные, которые содержат год
//        за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве
//        завершения периода расчета.
        int year = 2023;
        int startYear = year - 200;
        int finishYear = year + 100;
        for (i = 0; i <= finishYear; i += 79){
          if(i >= startYear){
              System.out.println(i);
          }
        }
    }
}