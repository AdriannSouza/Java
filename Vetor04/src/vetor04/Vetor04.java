package vetor04;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        int num[] = {3, 5, 4, 1, 2};
        Arrays.sort(num);
        for(int valor: num) {
            System.out.print(valor + " ");
        }
    }
    
}
