package contador03;

public class Contador03 {

    public static void main(String[] args) {
        int cc = 0;
        while (cc < 18) {
            cc++;
            if (cc == 2 || cc == 7 || cc == 9) {continue;}
            if (cc == 7) {break;}
        }
        System.out.println("Cambalhota " + cc);
    }
    
}
