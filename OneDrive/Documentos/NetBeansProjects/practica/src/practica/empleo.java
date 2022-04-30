/*
sub clase
 */
package practica;

import javax.swing.JOptionPane;

public class empleo extends persona {

    double sueldo;
    String telefono, direccion;

    public empleo(String nom, int ed, double suel, String tel, String dir) {
        super(nom, ed);
        this.direccion = dir;
        this.telefono = tel;
        this.sueldo = suel;
    }

    @Override
    public void verdatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad
                + "\nSueldo: " + sueldo + "\nTelefono: " + telefono + "\nDireccion: " + direccion,
                "DATOS DEL EMPLEADO", JOptionPane.INFORMATION_MESSAGE);

    }

}
