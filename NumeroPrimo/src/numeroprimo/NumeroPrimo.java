package numeroprimo;

/**
 *
 * @author Adrian Faria de Souza
 */
public class NumeroPrimo {

    public static void main(String[] args) {
    
    int n = 17;
    boolean isPrime = true;
    
    for (int i = 2; i <= n/2; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }
    
    if (isPrime) {
      System.out.println(n + " e um numero primo");
    } else {
      System.out.println(n + " nao e um numero primo");
    }
  }
 }
