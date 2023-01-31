package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        
        int idade = 30;
        //String valor = idade;
        /*ERRO devido a tentativa de atribuir um variável de número (idade) em uma variável string (valor).
          Mesmo se utilizar o método de typecast 'String valor = (String)idade;' permaneceria dando erro.*/
        
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        //Transforma a idade em string.
    }
    
}
