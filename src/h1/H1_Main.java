package h1;

import java.util.Arrays;

public class H1_Main {

    public static void main(String[] args) {

        int[] myArray = new int[]{5, 6, 7, 10};
        int[] bababoey = new int[myArray.length];

        int kakyoin = 0;

        for (int i = myArray.length - 1; i >= 0; i--) {

            bababoey[kakyoin] = myArray[i];
            kakyoin++;
        }

        for (int i = bababoey.length - 1; i >= 0; i--) {

            myArray[i] = bababoey[i];
        }


        System.out.println("myArray[]{" + myArray[0] + "," + myArray[1] + "," + myArray[2] + "," + myArray[3] + "}");

    }

}
