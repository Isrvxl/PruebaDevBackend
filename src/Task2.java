import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String cad;
        String inv = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite una cadena: ");

        cad = sc.nextLine();

        for (int i = cad.length() - 1; i >=0; i--){
            inv += cad.charAt(i);
        }
        System.out.println("La cadena invertida es: " + inv);

    }
}
