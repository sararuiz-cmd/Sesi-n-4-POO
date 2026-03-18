import javax.swing.*;

public class Delivery {
    public static void main(String[] args) {
        String fragil = JOptionPane.showInputDialog("¿El producto es frágil? (si/no)");
        double peso = Double.parseDouble(JOptionPane.showInputDialog(" dime cual es el peso del paquete ( en kg ). "));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog(" dime cual es la distancia del paquete ( en metros). "));
        if (peso > 50 && distancia > 100) {
            JOptionPane.showMessageDialog(null, "Transporte pesado");
        }
        else if (peso < 50 && fragil.equalsIgnoreCase("si")) {
            JOptionPane.showMessageDialog(null, "Envío Premium");
        }
        else if (peso < 10 && distancia < 20) {
            JOptionPane.showMessageDialog(null, "Dron");
        }
        else {
            JOptionPane.showMessageDialog(null, "El producto no aplica");
        }
    }
}
