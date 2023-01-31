package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Adrian";
        String nome2 = "Adrian";
        String nome3 = new String("Adrian");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        //igual
        
        String resa;
        resa = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(resa);
        /*igual
        se utilizarmos == para comparar as strings nome1 e nome3, o resultado seria 'diferente', mas
        para podermos comparar nome 1 a um objeto nome3, precisamos usar o .equals*/
    }    
}
