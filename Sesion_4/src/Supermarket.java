import java.util.Scanner;

public class Supermarket {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su tipo de membresia (bronce, plata, oro): ");
        String membresia = leer.nextLine().toLowerCase();

        System.out.println("Ingrese el valor de su compra: ");
        double compra = leer.nextDouble();

        double descuento = switch (membresia) {
            case "bronce" -> 0.05;
            case "plata" -> 0.10;
            case "oro" -> 0.15;
            default -> {
                System.out.println("Membresia no valida");
                yield 0;
            }
        };

        double precioFinal = compra - (compra * descuento);

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}