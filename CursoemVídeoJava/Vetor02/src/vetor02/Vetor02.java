package vetor02;

public class Vetor02 {

    public static void main(String[] args) {
        //Define os nomes dos meses dentro de um array mes.
        String mes[] = {"janeiro","fevereiro","marco","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        //Define o total de dias dos meses
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int c = 0; c < mes.length; c ++) {
            System.out.println("O mes de " + mes[c] + " tem " + tot[c]);
        }
    }
}
