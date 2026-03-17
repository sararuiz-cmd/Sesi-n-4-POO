import javax.swing.*;

public class ComplejidadContrasena {
    public static void main(String[] args) {
        boolean tiene_numero=false;
        boolean tiene_letra=false;
        String contra = JOptionPane.showInputDialog("Ingrese la contraseña: ");
        char arreglo[] = contra.toCharArray();
        if (arreglo.length <8) {
            JOptionPane.showMessageDialog(null, "Constraseña insegura (<8 caracteres)");
            return;

        }
        for (int i = 0; i < arreglo.length; i++) {
            if (Character.isDigit(arreglo[i])) {
                tiene_numero=true;
            }
            if (Character.isUpperCase(arreglo[i])) {
                tiene_letra=true;
            }
        }
        if (tiene_numero&&tiene_letra){
            JOptionPane.showMessageDialog(null, "Fuerte");
        } else if (tiene_numero){
            JOptionPane.showMessageDialog(null, "Moderada, agrega letras");

        }else {
            JOptionPane.showMessageDialog(null, "Moderada, agrega números");
        }
    }
}