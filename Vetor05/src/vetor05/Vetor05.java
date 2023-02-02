package vetor05;

import java.util.Arrays;

public class Vetor05 {

    public static void main(String[] args) {
        int vet[] = {3, 5, 1, 8, 4};
        for(int v: vet) {
            System.out.println(v + " ");
        }
        int pos = Arrays.binarySearch(vet,1);
        System.out.print("Encontrei o valor na posicao " + pos);
    }
    
}
