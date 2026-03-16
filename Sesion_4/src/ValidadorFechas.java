import javax.swing.*;
import java.util.Scanner;

public class ValidadorFechas {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        while (true) {
            System.out.println("Ingresa una fecha");
            System.out.println("Ingresa un dia: ");
            int dia= leer.nextInt();
            System.out.println("Ingresa un mes: ");
            int mes= leer.nextInt();
            System.out.println("Ingresa un año: ");
            int anio= leer.nextInt();
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
            if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasMes) {
                System.out.println("Fecha valida");
                System.out.println(""+dia +"/"+mes+"/"+anio);
                break;
            } else {
                System.out.println("Fecha invalida");
            }
        }

    }
}
