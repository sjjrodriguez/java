//MENU
import java.util.Scanner;

public class switchCase_nuevo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("1: Perro");
        System.out.println("2: Pizza");
        System.out.println("3: Hamburguesa");
        System.out.print("Ingrese una opción: ");
        int menu = scanner.nextInt();
        String eleccion = switch (menu) {
            case 1 -> "su pedido de de perro quedo registrado.";
            case 2 -> "su pedido de de pizza quedo registrado.";
            case 3 -> "su pedido de de hamburguesa quedo registrado.";
            default -> "Opción no registrada en el menú.";
        };

        System.out.println(eleccion);
    }
}
