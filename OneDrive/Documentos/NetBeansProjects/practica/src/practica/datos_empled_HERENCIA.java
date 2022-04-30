/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import javax.swing.JOptionPane;


public class datos_empled_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom,tel,dir;
        double suel;
        int ed;
        nom = JOptionPane.showInputDialog(null,"INGRESA LOS DATOS DEL EMPLEADO","INGRESA DATOS ",3);
        ed=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA LA EDAD DEL EMPLEADO","INGRESA DATOS ",3));
        suel=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESA EL SUELDO DEL EMPLEADO","INGRESA DATOS ",3));
        tel= JOptionPane.showInputDialog(null,"INGRESA EL TELEFONO DEL EMPLEADO","INGRESA DATOS ",3);
        dir= JOptionPane.showInputDialog(null,"INGRESA LA DIRECCION DEL EMPLEADO","INGRESA DATOS ",3);
        
        
        empleo empleado_1 = new empleo(nom,ed,suel,tel,dir);
        
        empleo empleado_2 = new empleo("andres", 23, 4000, "9876","kr 4 norte");
        empleo empleado_3 = new empleo("felipe", 22, 6000, "45667","kr 5 este");
        empleado_1.verdatos();
        empleado_2.verdatos();
        empleado_3.verdatos();
    }
    
}
