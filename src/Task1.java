import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a = 0,b = 1 ,c,n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para mostrar su serie de Fibonacci");

        n = sc.nextInt();

        System.out.println("La serie fibonacci es:");

        for (int i=0; i<n; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}
