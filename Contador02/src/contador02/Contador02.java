package contador02;

public class Contador02 {

    public static void main(String[] args) {
        int cc = 0;
        
        while (cc < 10) {
            cc++;
            //Enquanto o break para o processo, o continue volta para o processo.
            if (cc == 5 || cc == 7) {continue;}
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
