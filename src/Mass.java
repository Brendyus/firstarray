import java.util.Random;

public class Mass {
    static int small1;
    static int small2;
    static int large1;
    static int large2;
    static int min1;
    static int min2;
    static int max1;
    static int max2;

    public static void main(String[] argrs) {
        int[][] fullarray = new int[5][5];
        int[][] minarray = new int[5][2];
        int[][] maxarray = new int[5][2];
        Random random = new Random();
        int lowb = -51;
        int upb = 51;
        System.out.println("Это у нас знач массив: \n");
        for (int i = 0; i < fullarray.length; i++) {
            value();
            for (int j = 0; j < fullarray.length; j++) {
                fullarray[i][j] = random.nextInt(upb - lowb) + lowb;
                System.out.printf(" %d ", fullarray[i][j]);}
            System.out.println();}
        for (int i = 0; i < fullarray.length; i++) {
            value();
            for (int j = 0; j < fullarray.length; j++) {
                if (large1 < fullarray[i][j]) {
                    large2 = large1;
                    large1 = fullarray[i][j];
                } else {
                    if (large2 < fullarray[i][j]) {
                        large2 = fullarray[i][j];
                    }
                }
                if (small1 > fullarray[j][i]) {
                    small2 = small1;
                    small1 = fullarray[j][i];
                } else {
                    if (small2 > fullarray[j][i]) {
                        small2 = fullarray[j][i];
                    }
                }
                minarray[i][0] = small1;
                minarray[i][1] = small2;
                maxarray[i][0] = large1;
                maxarray[i][1] = large2;
            }
        }
        System.out.println("Это у нас знач максимальные числа по строкам: \n");
        for (int i = 0; i < 5; i++) {
            System.out.println(maxarray[i][0] + " " + maxarray[i][1]);
            System.out.println();
            for (int j = 0; j < 2; j++) {
                if (max1 < maxarray[i][j]) {
                    max2 = max1;
                    max1 = maxarray[i][j];
                } else {
                    if (max2 < maxarray[i][j]) {
                        max2 = maxarray[i][j];
                    }
                }
            }
        }
        int maxmax = max1 + max2;
        System.out.printf("Сумма максимальных значений массива MAX = %d\n", maxmax);
        System.out.println("Это у нас знач минимальные числа по столбцам: \n");
        for (int i = 0; i < 5; i++) {
            System.out.println(minarray[i][0] + " " + minarray[i][1]);
            System.out.println();
            for (int j = 0; j < 2; j++) {
                if (min1 > minarray[i][j]) {
                    min2 = min1;
                    min1 = minarray[i][j];
                } else {
                    if (min2 > minarray[i][j]) {
                        min2 = minarray[i][j];
                    }
                }
            }
        }
        int minmin = min1 + min2;
        System.out.printf("Сумма минимальных значений массива MIN = %d\n", minmin);
    }

    private static void value() {
        large1 = -51;
        large2 = -51;
        small1 = 51;
        small2 = 51;
        min1 = 51;
        min2 = 51;
        max1 = -51;
        max2 = -51;
    }
}
