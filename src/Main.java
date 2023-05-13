import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // REFAC: Variable inutilizada
        //String p = "Proves";

        int opcio;
        do {
            // REFAC: Extraer el menú en un método
            menu();

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    System.out.println("intro: ");
                    int num1 = scan.nextInt();
                    System.out.println("intro: ");
                    int num2 = scan.nextInt();
                    if (max(num1,num2)) {
                        System.out.println("aaa");
                    }
                    else System.out.println("bbb");
                    break;
                case 2:
                    // REFACT: Variables finales
                    final double a=2;
                    final double b=3;
                    final double c=1;
                    calcEquacioSegongrau(2.00, 3.00, 1.00);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
    public static boolean max(int a, int b) {
        // REFAC: Cambiado el return por uno más simple
        return a > b;
    }
    public static void calcEquacioSegongrau(double a, double b, double c) {
        // REFAC: Variable temporal
        final double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            // REFAC: Variable temporal
            final double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }

    public static void menu() {
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Acabar");
    }

    // REFAC: Extraida la clase Human a su propio archivo
    // REFAC: Extraida la clase Order a su propio archivo
    // REFAC: Extraida la clase OrderLineItem a su propio archivo
    // REFAC: Extraida la clase Customer a su propio archivo

}
