package r07;

import java.util.ArrayList;
import java.util.List;

public class PointFour {

    public static int factorial( int x ){
        int result = 1;
        for (int i = 1; i <=x; i++) {
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
