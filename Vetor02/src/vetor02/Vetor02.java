package vetor02;

public class Vetor02 {

    public static void main(String[] args) {
        String mes[] = {"janeiro","fevereiro","marco","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int c = 0; c < mes.length; c ++) {
            System.out.println("O mes de " + mes[c] + " tem " + tot[c]);
        }
    }
    
}
