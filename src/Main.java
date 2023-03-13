import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a = 0;
        int[] array = {1, 3, 5, 7, 9};
        Arrays.sort(array);
        for (int i : array) {
            a += (1.0 / i);
        }

        System.out.println("Dizideki sayıların harmonik ortalaması : " + a);
    }
}