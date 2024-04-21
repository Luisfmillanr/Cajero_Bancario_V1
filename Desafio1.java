import java.util.Scanner;

public class Desafio1 {

    // Método principal que ejecuta la aplicación
    public static void main(String[] args) {
        // Variables para almacenar los detalles del cliente y su cuenta
        String nombre = "Luis Millan";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        // Imprime la cabecera con la información del cliente
        System.out.println("*************************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("\n*************************************************");

        // String con el menú de opciones, utilizando text blocks para mejor claridad
        String menu = """
                *** Elija la opcion deseada: ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                
                """;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Bucle while para procesar las opciones del menú hasta que el usuario decida salir
        while (opcion != 9) {
            System.out.println(menu); // Mostrar el menú
            opcion = teclado.nextInt(); // Leer la opción del usuario

            // Estructura switch para manejar las opciones seleccionadas
            switch (opcion) {
                case 1: // Consultar saldo
                    System.out.println("El Saldo actual de tu cuenta es : " + saldo);
                    break;
                case 2: // Retirar dinero
                    System.out.println("¿Cual es el valor que deseas retirar?: ");
                    double valorAretirar = teclado.nextDouble();
                    if (saldo < valorAretirar) { // Verificar si hay suficiente saldo
                        System.out.println("Saldo Insuficiente!");
                    } else {
                        saldo -= valorAretirar; // Retirar el dinero y actualizar el saldo
                        System.out.println("Tu saldo actualizado es: " + saldo);
                    }
                    break;
                case 3: // Depositar dinero
                    System.out.println("Valor a depositar: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar; // Añadir el depósito al saldo
                    System.out.println("Saldo después de depositar: " + saldo);
                    break;
                case 9: // Salir del programa
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default: // Manejar opciones inválidas
                    System.out.println("Opcion no valida");
                    break;
            }
        }

        teclado.close(); // Cerrar el scanner para liberar recursos
    }
}
