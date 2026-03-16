import javax.swing.*;
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        while (true) {

            System.out.println("Ingresa una fecha");

            System.out.println("Ingresa un dia: ");
            int dia = leer.nextInt();

            System.out.println("Ingresa un mes: ");
            int mes = leer.nextInt();

            System.out.println("Ingresa un año: ");
            int anio = leer.nextInt();

            boolean bisiesto = false;

            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                bisiesto = true;
            }

            int diasMes = switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> (bisiesto) ? 29 : 28;
                default -> 0;
            };

            if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasMes) {
                System.out.println("Fecha valida");
                System.out.println(dia + "/" + mes + "/" + anio);
                break;
            } else {
                System.out.println("Fecha invalida");
            }
        }
    }
}