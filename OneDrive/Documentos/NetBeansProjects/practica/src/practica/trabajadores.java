/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

class trabajo {

    public double pago(int horas, double dinero) {
        double r = horas * dinero;
        return r;
    }
}

public class trabajadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        trabajo trb = new trabajo();
        Scanner os = new Scanner(System.in);

        System.out.println("Tu sueldo por horas trabajadas es de  " + "\n" + trb.pago(2, 35000) + " $ pesos" + "\n");

    }

}
