package practica;

import java.util.Scanner;

public class mayor_o_menor {

    public static void main(String[] args) {

        Scanner os = new Scanner(System.in);

        int numero;
        numero = os.nextInt();

        if (numero < 0) {
            System.out.println("es negativo");
        }
        if (numero > 100) {
            System.out.println("es positivo");
        }
        if (numero >= 0 && numero <= 100) {
            System.out.println("esta en el intervalo");
        }

    }

}
