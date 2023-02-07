package vetor06;

import java.util.Arrays;

public class Vetor06 {

    public static void main(String[] args) {
        int v[] = new int[20]; 
        //Cria uma varíavel inteira e determina 20 posições a ela.
        Arrays.fill(v, 0);
        //Preenche todas as posições com o número 0.
        for(int valor: v) {
            System.out.println(valor);
        }
    }
    
}
