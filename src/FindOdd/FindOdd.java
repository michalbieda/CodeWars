package FindOdd;

import java.util.Arrays;

public class FindOdd {
    public static void main(String[] args) {

        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));

    }

    public static int findIt(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int testedNumber=0;

            for (int j=0; j<a.length; j++){
                if (a[j] == a[i]) {
                    testedNumber++;
                }
           }
            if ((testedNumber % 2) != 0) {
                return a[i];
            }
        }
        return 0;
    }


}


