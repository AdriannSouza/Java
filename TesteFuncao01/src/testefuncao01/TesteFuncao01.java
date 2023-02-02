package testefuncao01;

public class TesteFuncao01 {

    static void soma(int a, int b) {
        int s = a + b; //Soma ambas variáveis
        System.out.println("A soma e " + s);        
    }
    
    public static void main(String[] args) {
        //O programa prioriza iniciar o programa a partir do método main.
        System.out.println("Começou o programa");
        soma(5,2); 
    }
}
