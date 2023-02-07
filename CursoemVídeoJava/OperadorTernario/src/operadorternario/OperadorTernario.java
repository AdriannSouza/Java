package operadorternario;

public class OperadorTernario {
    
    public static void main(String[] args) {
       int n1, n2; //Criando duas variáveis de números inteiros.
       n1 = 4;
       n2 = 8;
       int ra = n1 > n2 ? n1:n2;
       int rb = n1 > n2 ? 0:1;
        //Caso n1 for maior que n2, recebe 1, se n1 NÃO for maior que n2, recebe 0. Ou seja, true:false.
        System.out.println(ra);
        System.out.println(rb);
    }   
}
