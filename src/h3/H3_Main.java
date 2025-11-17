package h3;

public class H3_Main {

    public static void main(String[] args) {

        int[][] einheiten = new int[][]{{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        int input = 7017;

        while (input > 0) {

            for (int i = 0; i <= 14; i++) {

                einheiten[1][i] = input / einheiten[0][i];
                input = input % einheiten[0][i];

                System.out.print("Anzahl an " + einheiten[0][i] + " = " + einheiten[1][i] + ", ");

            }

        }

    }

}
