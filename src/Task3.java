import java.util.Scanner;

public class Task3 {
    static int Multiplicacion(int n1, int n2){
        int r = 0;

        for (int i=0; i<n2; i++){
            r += n1;
        }

        return r;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero a multiplicar: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero a multiplicar: ");
        int n2 = sc.nextInt();

        System.out.println("El resultado es: " + Multiplicacion(n1,n2));
    }
}
