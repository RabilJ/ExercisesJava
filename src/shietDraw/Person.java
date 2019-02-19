package shietDraw;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę większą od zera");
        int iterations = sc.nextInt();
        StringBuilder builder = StarShaper.spaces(iterations);
        StringBuilder starBuilder = StarShaper.stors(iterations);
        for (int i = 0; i < iterations - 1; i++) {
            System.out.print(builder);
            System.out.println(starBuilder);
            builder.deleteCharAt(0);
        }
    }
}