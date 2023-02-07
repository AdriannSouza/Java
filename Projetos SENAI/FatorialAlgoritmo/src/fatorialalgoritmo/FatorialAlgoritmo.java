
package fatorialalgoritmo;

public class FatorialAlgoritmo {

    public static void main(String[] args) {
        
         //Define o número cujo fatorial será calculado
        int n1 = 5;
        
        //Define aonde o fatorial será armazenado
        int fat = 1;
        
        /*Define um contador i, começando com 1 e sempre que a condicional 'for'
        satisfeita, i receberá +1*/
        for (int i =1; i <= n1; i++){
            
            //O número armazenado dentro do fat será ele vezes o contador i.
            fat = fat * i;
        }
        
        System.out.println("O fatorial de " + n1 + " = " + fat);
    }
    
}
