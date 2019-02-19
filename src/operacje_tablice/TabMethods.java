package operacje_tablice;

public class TabMethods {

    public static int[][] returnHigherValuedTab(int[][] tab1, int[][] tab2) {
        int sumTab1 = 0;
        int sumTab2 = 0;
        sumTab1 = getSumTab(tab1);
        sumTab2 = getSumTab(tab2);
        if (sumTab1 > sumTab2)
            return tab1;
        else if (sumTab2 > sumTab1)
            return tab2;
        else
            return null;
    }

    public static int getSumTab(int[][] tab) {
        int sumTab = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                sumTab += tab[i][j];
            }
        }
        return sumTab;
    }

    public static void printTab(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println(tab[i][j]);
            }
        }
    }

    public static void printTab(String[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static String[] getTabWithMoreChars(String[] tab1, String[] tab2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < tab1.length; i++) {
            sum1 += tab1[i].length();
        }
        for (int i = 0; i < tab2.length; i++) {
            sum2 += tab2[i].length();
        }
        if (sum1 > sum2)
            return tab1;
        else
            return tab2;
    }

    public static int returnMax(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];

            }
        }
        return max;
    }
    public static int returnMin(int[] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];

            }
        }
        return min;
    }
    public static int[]returnBiggestRow(int[][]tab){
        int[] maxRow = tab[0];
        int max = sumRow(tab[0]);
        for (int i = 0; i < tab.length; i++) {
            if(sumRow(tab[i])>max){
                maxRow = tab[i];
            }
        }
        return maxRow;
    }
    private static int sumRow(int []tab){
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum+=tab[i];
        }
        return sum;
    }
}

