import javax.swing.*;
import java.util.Scanner;

public class ValidadorFechas {
    public static void main(String[] args) {
        while (true) {
            int dia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dia: "));
            int mes=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un mes: "));
            int anio=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un año: "));
            boolean bisiesto=false;
            if((anio %4==0 && anio !=100)||(anio%400==0)){
                bisiesto=true;
            }
            int diasMes = 0;
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                diasMes = 31;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasMes = 30;
            } else if (mes == 2) {
                if (bisiesto) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
            }
            if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasMes && diasMes==29) {
                JOptionPane.showMessageDialog(null,"Fecha válida, año bisiesto: "+dia+"/"+mes+"/"+anio);
                break;
            } else if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasMes) {
                JOptionPane.showMessageDialog(null,"Fecha válida: "+dia+"/"+mes+"/"+anio);
                break;}
            else {
                JOptionPane.showMessageDialog(null,"Fecha inválida, intenta de nuevo");
            }
        }

    }
}
