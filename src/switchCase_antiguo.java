//menu
import java.util.Scanner;
public class switchCase_antiguo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("1: Perro");
        System.out.println("2: Pizza");
        System.out.println("3: Hamburguesa");
        System.out.print("Ingrese una opción: ");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("su pedido de de perro quedo registrado.");
                break;
            case 2:
                System.out.println("su pedido de de pizza quedo registrado.");
                break;
            case 3:
                System.out.println("su pedido de de hamburguesa quedo registrado.");
            default:
                System.out.println("Opción no registrada en el menú..");
        }
    }
}
