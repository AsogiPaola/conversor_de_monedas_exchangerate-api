import com.aluracursos.api.Peticiones;
import com.aluracursos.monedas.InfoMonedas;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        InfoMonedas moneda;
        double cantidadDinero = 0.0;
        String ingreso = "Por favor ingrese la cantidad que desea convertir: ";

        String menu = """
                Bienvenido al Conversor de Monedas Internacionales
                Seleccione una opción para conocer la conversión que desea realizar:
                
                1. Dólar            --> Peso Argentinos
                2. Peso Argentino   --> Dólar
                3. Dólar            --> Real Brasileños
                4. Real Brasileño   --> Dólar
                5. Dólar            --> Peso Colombiano
                6. Peso Colombiano  --> Dólar
                7. Salir
                """;

        Peticiones peticiones = new Peticiones();
        int opcion = 0;

        while (opcion != 7) {
            try {
                // Mostrar el menú en una ventana emergente
                String opcionStr = JOptionPane.showInputDialog(null, menu, "Conversor de Monedas", JOptionPane.QUESTION_MESSAGE);

                if (opcionStr == null) {
                    // Si el usuario cierra la ventana emergente
                    JOptionPane.showMessageDialog(null, "Programa cerrado.");
                    break;
                }

                opcion = Integer.parseInt(opcionStr); // Convertir la opción a entero

                switch (opcion) {
                    case 1:
                        cantidadDinero = obtenerCantidad(ingreso);
                        moneda = peticiones.getConvertMoney("USD", "ARS", cantidadDinero);
                        mostrarResultado(moneda, cantidadDinero);
                        break;
                    case 2:
                        cantidadDinero = obtenerCantidad(ingreso);
                        moneda = peticiones.getConvertMoney("ARS", "USD", cantidadDinero);
                        mostrarResultado(moneda, cantidadDinero);
                        break;
                    case 3:
                        cantidadDinero = obtenerCantidad(ingreso);
                        moneda = peticiones.getConvertMoney("USD", "BRL", cantidadDinero);
                        mostrarResultado(moneda, cantidadDinero);
                        break;
                    case 4:
                        cantidadDinero = obtenerCantidad(ingreso);
                        moneda = peticiones.getConvertMoney("BRL", "USD", cantidadDinero);
                        mostrarResultado(moneda, cantidadDinero);
                        break;
                    case 5:
                        cantidadDinero = obtenerCantidad(ingreso);
                        moneda = peticiones.getConvertMoney("USD", "COP", cantidadDinero);
                        mostrarResultado(moneda, cantidadDinero);
                        break;
                    case 6:
                        cantidadDinero = obtenerCantidad(ingreso);
                        moneda = peticiones.getConvertMoney("COP", "USD", cantidadDinero);
                        mostrarResultado(moneda, cantidadDinero);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro programa de Conversión de Monedas. \n ¡Vuelva pronto!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. \n Por favor, ingrese una de las opciones del menu.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. \n Por favor, ingrese un número.");
            }
        }
    }

    // Método auxiliar para pedir la cantidad de dinero en una ventana emergente
    private static double obtenerCantidad(String mensaje) {
        String cantidadStr = JOptionPane.showInputDialog(null, mensaje, "Cantidad a convertir", JOptionPane.QUESTION_MESSAGE);
        return Double.parseDouble(cantidadStr); // Convertir la cantidad a double
    }

    // Método auxiliar para mostrar el resultado en una ventana emergente
    private static void mostrarResultado(InfoMonedas moneda, double cantidadDinero) {
        String resultado = cantidadDinero + " " + moneda.getBase_code() + " corresponden a " + moneda.getConversion() + " " + moneda.getTarget_code();
        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
