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
    }
}