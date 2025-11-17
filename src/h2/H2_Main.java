package h2;

import java.util.Scanner;

public class H2_Main {

    public static void main(String[] args) {

        int n = 299;
        int digits = 0;
        int[] a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};

        int polnareff = n;

        while (polnareff > 0) {

            polnareff = polnareff / 10;
            digits++;

        }

        while (n > 0) {

            for (int i = a.length - 1; i >= 0; i--) {

                a[i] = n % 10;
                n = n / 10;

            }

        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }


    }

}
