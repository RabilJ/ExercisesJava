package operacje_tablice;

import java.util.Objects;

public class TabTest {
    public static void main(String[] args) {
        int[][]tab1 = {{4,4},
                {4,4}};


        int[][]tab2 = {{3,3},
                {3,3}};


        System.out.println("Suma liczb pierwszej tablicy: "+TabMethods.getSumTab(tab1));
        System.out.println("Suma liczb drugiej tablicy: "+TabMethods.getSumTab(tab2));

        System.out.println("Największa tablica:");
        TabMethods.printTab(Objects.requireNonNull(TabMethods.returnHigherValuedTab(tab1, tab2)));

        int[][]tab = new int[4][];
        tab[0] = new int[3];
        tab[1] = new int[2];
        tab[2] = new int[4];
        tab[3] = new int[1];
        int number = 1;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j]=number;
                number++;
            }

        }
        TabMethods.printTab(tab);
        String[]word1 = {"Ala","Ma","Kota"};
        String[]word2 = {"Halo","Tu","Amadeusz"};
        TabMethods.printTab(TabMethods.getTabWithMoreChars(word1,word2));
        int[]numbers = {1,2,3,4,5,6,7,8};
        System.out.println(TabMethods.returnMax(numbers));
        System.out.println(TabMethods.returnMin(numbers));

        int[][]numbers2Dim = {{1,2,3},
                {3,4,5},
                {6,7,8}};
        for (int i = 0; i < TabMethods.returnBiggestRow(numbers2Dim).length; i++) {
            System.out.println(TabMethods.returnBiggestRow(numbers2Dim)[i]);
        }
    }

}
