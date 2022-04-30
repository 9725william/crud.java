/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {

        System.out.println("hola de nuevo william lo lograras samurai" + "\n");

        Scanner os = new Scanner(System.in);
        int genero = 0, niños = 0, niñas = 0;

        do {
            System.out.println("Ingrese el genero 1 niño 2 niña");

            genero = os.nextInt();
            switch (genero) {

                case 1:
                    niños++;
                    break;

                case 2:
                    niñas++;
                    break;
            }
        } while (genero != 0);

        System.out.println("la cantidad de niños es de " + niños);
        System.out.println("la cantidad de niñas es de " + niñas);

    }

}
