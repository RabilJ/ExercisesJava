package shietDraw;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[]table = new int[10];
        for (int number : table) {
            number = random.nextInt(100);
            System.out.println(number);
            if (number%3==0&&number%5==0){
                System.out.println("FizzBuzz");
            }else if(number%5==0){
                System.out.println("Buzz");
            }else if(number%3==0){
                System.out.println("Fizz");
            }else {
                System.out.println("");
            }
        }
    }
}
