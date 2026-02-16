package holamundo;

public class SerieFibonacci {

    public static void main(String[] args) {

        int n = 10; // 
        
        int primero = 0;
        int segundo = 1;
        
        System.out.println("Serie Fibonacci con " + n + " términos:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(primero + " ");
            

            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }

}