package pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String yes = "Да", no = "Нет";
        System.out.println("Хочешь ли ты пиццу?");
        Scanner read = new Scanner(System.in);
        String answer = read.nextLine();
        if(answer.equals(yes)) {
            System.out.println("Готовлю пиццу");
            Thread.sleep(5000);
            System.out.println("Пицца приготовлена, кушац подано");
        } else if(answer.equals(no)) {
            System.out.println("Пока!");
        }
    }
}
