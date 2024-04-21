import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        String nombre = "Luis Millan";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("*************************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("\n*************************************************");

        String menu = """
                *** Elija la opcion deseada: ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                                
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El Saldo actual de tu cuenta es : " + saldo);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que deseas retirar?: ");
                    double valorAretirar = teclado.nextDouble();
                    if (saldo < valorAretirar) {
                        System.out.println("Saldo Insuficiente!");
                    } else {
                        saldo = saldo - valorAretirar;
                        System.out.println("Tu saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Valor a depositar: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo = saldo + valorADepositar;
                    System.out.println(saldo);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

                }
            }
        }

}