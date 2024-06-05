import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoOpcion = new Scanner(System.in);
        Scanner tecladoDineroIngresado = new Scanner(System.in);
        double cantidadDinero = 0 ;
        int opcion = 0;
        ConvertirMoneda conversion = new ConvertirMoneda();


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


        boolean salir = false;
        while (!salir){
            System.out.print(menuOpciones);
            opcion = tecladoOpcion.nextInt();
            switch ( opcion ){
                case 1:
                    //String pesoBase = "USD";
                    String pesoAConvertir = "ARS";

                    System.out.println("Ingresa la cantidad de Dolares a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();

                    Moneda dolarAArgs = conversion.convertirDolar(pesoAConvertir,cantidadDinero);
                    System.out.println("Los "+ cantidadDinero+" [USD] equivalen a: "+ dolarAArgs.conversion_result()+" [ARS]");
                break;
                case 2:
                    System.out.println("Ingresa la cantidad de Pesos Argentinos a convertir: ");

                    System.out.println("Los  (cantidad)[ARS] equivalen a: (cantidad) [USD]");
                    break;
                case 3:
                    String pesoAConvertir1 = "BRL";
                    System.out.println("Ingresa la cantidad de Dolares a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();

                    Moneda dolarABrl = conversion.convertirDolar(pesoAConvertir1,cantidadDinero);
                    System.out.println("Los "+ cantidadDinero+" [USD] equivalen a: "+ dolarABrl.conversion_result()+" [BRL]");
                    break;
                case 4:
                    System.out.println("Ingresa la cantidad de Reales Brasileños a convertir: ");

                    System.out.println("Los  (cantidad)[BRL] equivalen a: (cantidad) [USD]");
                    break;
                case 5:
                    String pesoAConvertir2 = "COP";
                    System.out.println("Ingresa la cantidad de Dolares a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();

                    Moneda dolarACop = conversion.convertirDolar(pesoAConvertir2,cantidadDinero);
                    System.out.println("Los "+ cantidadDinero+" [USD] equivalen a: "+ dolarACop.conversion_result()+" [COP]");
                    break;
                case 6:
                    System.out.println("Ingresa la cantidad de Pesos Colombianos a convertir: ");

                    System.out.println("Los  (cantidad)[COP] equivalen a: (cantidad) [USD]");
                    break;
                case 7:
                    System.out.println("El programa del conversor, ha finalizado.");
                    salir = true;
                break;
            }
        }


    }
}
