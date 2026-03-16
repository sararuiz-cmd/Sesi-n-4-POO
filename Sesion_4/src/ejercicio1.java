import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args) {
        String pesostr = JOptionPane.showInputDialog(" dime cual es el peso del paquete ( en kg ). ");
        String distanciastr = JOptionPane.showInputDialog(" dime cual es la distancia del paquete ( en metros). ");
        String fragil = JOptionPane.showInputDialog("¿El producto es frágil? (si/no)");
        double peso = Double.parseDouble(pesostr);
        double distancia = Double.parseDouble(distanciastr);
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
