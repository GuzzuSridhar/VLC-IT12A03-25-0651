package arrays;

public class MultiDimentional {
    public static void main(String[] args) {
        // multi dimentional array
        int[][] table = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        System.out.print(table[0][0]);
        System.out.print(table[0][1]);
        System.out.println();
        System.out.print(table[1][0]);
        System.out.print(table[1][1]);
        System.out.println();
        System.out.print(table[2][0]);
        System.out.print(table[2][1]);

        // blank multidimentional array
        int[][] tab = new int[3][3];
        tab[0][0] = 1;
        tab[0][1] = 2;
        tab[0][2] = 3;
        tab[1][0] = 4;
        tab[1][1] = 5;
        tab[1][2] = 6;
        tab[2][0] = 7;
        tab[2][1] = 8;
        tab[2][2] = 9;

        System.out.println();

        System.out.print(tab[0][0]);
        System.out.print(tab[0][1]);
        System.out.print(tab[0][2]);
        System.out.println();
        System.out.print(tab[1][0]);
        System.out.print(tab[1][1]);
        System.out.print(tab[1][2]);
        System.out.println();
        System.out.print(tab[2][0]);
        System.out.print(tab[2][1]);
        System.out.print(tab[2][2]);
    }
}
