package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean ra; //define o type e o nome da varíavel.
        ra = (x < y && y < z)?true:false;
        //precisa que ambos sejam verdadeiros.
        //true e true &&
        System.out.println(ra);
        
        boolean rb; //define o type boolean e nomeia como rb.
        rb = (x < y && y == z)?true:false;
        //precisa que ambos sejam verdadeiros.
        //true e false &&
        System.out.println(rb);
        
        boolean rc;
        rc = (x < y || y == z)? true:false;
        //precisa que um dos dois seja verdadeiro.
        System.out.println(rc);
        boolean rd;
        rd = (x < y ^ y == z)?true:false;
        //precisa que um ou exclusivamente outro seja verdadeiro, mesma lógica do || porém é falso quando ambos são verdadeiros.
    }  
}
