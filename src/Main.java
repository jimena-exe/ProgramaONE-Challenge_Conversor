import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("\nBienvenido al conversor de moneda más efectivo del mercado :D");
        String menuOpciones = """
                \n++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                1) Convertir: Dolar a Peso Argentino 
                2) Convertir: Peso Argentino a Dolar
                3) Convertir: Dolar a Real Brasileño
                4) Convertir: Real Brasileño a Dolar
                5) Convertir: Dolar a Peso Colombiano
                6) Convertir: Peso Colombiano a Dolar
                7) Salir del programa.
                ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                \n¿Qué moneda deseas convertir el día de hoy? (elige un número del menú): """;


        while (opcion != 9){
            System.out.print(menuOpciones);
            opcion = teclado.nextInt();
            switch ( opcion ){
                case 1:
                    System.out.println("Elejiste la opción 1");
                break;
                case 2:
                    System.out.println("Elejiste la opción" + opcion);
                    break;
                case 3:
                    System.out.println("Elejiste la opción 3");
                    break;
                case 4:
                    System.out.println("Elejiste la opción 4");
                    break;
                case 5:
                    System.out.println("Elejiste la opción 5");
                    break;
                case 6:
                    System.out.println("Elejiste la opción 1");
                    break;
                case 7:
                    System.out.println("Elejiste la opción 1");
                    break;
                case 8:
                    System.out.println("Elejiste la opción 1");
                    break;
                case 9:
                    System.out.println("Elejiste la opción 1");
                    break;


            }
        }


        /**
         * Idea:
         * El usuario ingresa un número del menú
         * Decirle, has elegido tal conversión
         * debe ingresar la cantidad de dinero
         * El programa la muestra la cantidad convertida al otro peso
         * Vuelve y aparece el menú*/

        /**
         * Back
         * Main= menú
         * Clase moneda, construye el objeto moneda = me trae los datos de esa moneda
         * Clase Convertir = Hace el request a la API
         * X cantidad * valor de la moneda
         * */
        /**
         * Solo necesito la cantidad a convertir
         * dónde pongo esa cantidad?
         * Paises ya son por default**/



    }
}
