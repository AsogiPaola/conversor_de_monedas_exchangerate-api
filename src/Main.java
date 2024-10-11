import com.aluracursos.api.Peticiones;
import com.aluracursos.monedas.InfoMonedas;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        InfoMonedas moneda;
        int opcion = 0;
        double cantidadDinero= 0.0;
        String ingreso = "Por favor ingrese la cantidad que desea convertir: ";

        String menu = """
                ******************************************
                Bienvenido al Conversor de Monedas Internacionales\s
                Seleccione una Opcion para conocer la conversion que desea realizar:\s
                1. Dólar           --> Peso Argentinos
                2. Peso Argentino  --> Dólar
                3. Dólar           --> Real Brasileños
                4. Real Brasileño  --> Dólar
                5. Dólar           --> Peso Colombiano
                6. Peso Colombiano --> Dólar
                7. Salir\s
                ******************************************""";

        Peticiones peticiones = new Peticiones();

        while (opcion != 7) {
            try {
                System.out.println(menu);
                opcion = teclado.nextInt(); // Lee la opción del usuario

                switch (opcion) {
                    case 1:
                        System.out.println(ingreso);
                        cantidadDinero = teclado.nextDouble();
                        moneda = peticiones.getConvertMoney("USD", "ARS", cantidadDinero);
                        System.out.println("Por un " + moneda.getBase_code() + " obtienes " + moneda.getConversion_rate() + " " + moneda.getTarget_code());
                        System.out.println(cantidadDinero + " " + moneda.getBase_code() + " corresponden a " + moneda.getConversion() + " " + moneda.getTarget_code());
                        break;
                    case 2:
                        System.out.println(ingreso);
                        cantidadDinero = teclado.nextDouble();
                        moneda = peticiones.getConvertMoney("ARS", "USD", cantidadDinero);
                        System.out.println("Por un " + moneda.getBase_code() + " obtienes " + moneda.getConversion_rate() + " " + moneda.getTarget_code());
                        System.out.println(cantidadDinero + " " + moneda.getBase_code() + " obtienes " + moneda.getConversion() + " " + moneda.getTarget_code());
                        break;
                    case 3:
                        System.out.println(ingreso);
                        cantidadDinero = teclado.nextDouble();
                        moneda = peticiones.getConvertMoney("USD", "BRL", cantidadDinero);
                        System.out.println("Por un " + moneda.getBase_code() + " obtienes " + moneda.getConversion_rate() + " " + moneda.getTarget_code());
                        System.out.println(cantidadDinero + " " + moneda.getBase_code() + " obtienes " + moneda.getConversion() + " " + moneda.getTarget_code());
                        break;
                    case 4:
                        System.out.println(ingreso);
                        cantidadDinero = teclado.nextDouble();
                        moneda = peticiones.getConvertMoney("BRL", "USD", cantidadDinero);
                        System.out.println("Por un " + moneda.getBase_code() + " obtienes " + moneda.getConversion_rate() + " " + moneda.getTarget_code());
                        System.out.println(cantidadDinero + " " + moneda.getBase_code() + " obtienes " + moneda.getConversion() + " " + moneda.getTarget_code());
                        break;
                    case 5:
                        System.out.println(ingreso);
                        cantidadDinero = teclado.nextDouble();
                        moneda = peticiones.getConvertMoney("USD", "COP", cantidadDinero);
                        System.out.println("Por un " + moneda.getBase_code() + " obtienes " + moneda.getConversion_rate() + " " + moneda.getTarget_code());
                        System.out.println(cantidadDinero + " " + moneda.getBase_code() + " obtienes " + moneda.getConversion() + " " + moneda.getTarget_code());
                        break;
                    case 6:
                        System.out.println(ingreso);
                        cantidadDinero = teclado.nextDouble();
                        moneda = peticiones.getConvertMoney("COP", "USD", cantidadDinero);
                        System.out.println("Por un " + moneda.getBase_code() + " obtienes " + moneda.getConversion_rate() + " " + moneda.getTarget_code());
                        System.out.println(cantidadDinero + " " + moneda.getBase_code() + " obtienes " + moneda.getConversion() + " " + moneda.getTarget_code());
                        break;
                    case 7:
                        System.out.println("Gracias por utilizar nuestro programa de Conversion de Monedas, vuelva pronto.");
                        break;
                    default:
                        System.out.println("Opción no válida, por favor ingrese una opción correcta.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                teclado.next(); // Limpiar la entrada inválida
            }
        }
    }
}
