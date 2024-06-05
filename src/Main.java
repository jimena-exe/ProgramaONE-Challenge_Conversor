import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoOpcion = new Scanner(System.in);
        Scanner tecladoDineroIngresado = new Scanner(System.in);
        double cantidadDinero;
        int opcion;


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
            ConvertirMoneda conversion = new ConvertirMoneda();
            String pesoArs = "ARS";
            String pesoBrl = "BRL";
            String pesoCop = "COP";

            switch ( opcion ){
                case 1: //USD - ARS
                    System.out.println("Ingresa la cantidad de Dolares a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();
                    Moneda dolarAArgs = conversion.convertirDolar(pesoArs,cantidadDinero);
                    System.out.println("Los "+ cantidadDinero+" [USD] equivalen a: "+ dolarAArgs.conversion_result()+" [ARS]");
                break;
                case 2://ARS - USD
                    System.out.println("Ingresa la cantidad de Pesos Argentinos a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();
                    Moneda arsADolar = conversion.convertirCantidadADolar(pesoArs,cantidadDinero);
                    System.out.println("Los "+cantidadDinero+" [ARS] equivalen a: "+arsADolar.conversion_result()+" [USD]");
                    break;
                case 3://USD - BRL
                    System.out.println("Ingresa la cantidad de Dolares a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();
                    Moneda dolarABrl = conversion.convertirDolar(pesoBrl,cantidadDinero);
                    System.out.println("Los "+ cantidadDinero+" [USD] equivalen a: "+ dolarABrl.conversion_result()+" [BRL]");
                    break;
                case 4://BRL - USD
                    System.out.println("Ingresa la cantidad de Reales Brasileños a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();
                    Moneda brlADolar = conversion.convertirCantidadADolar(pesoBrl,cantidadDinero);
                    System.out.println("Los "+cantidadDinero+" [BRL] equivalen a: "+brlADolar.conversion_result()+" [USD]");
                    break;
                case 5://USD - COP
                    System.out.println("Ingresa la cantidad de Dolares a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();
                    Moneda dolarACop = conversion.convertirDolar(pesoCop,cantidadDinero);
                    System.out.println("Los "+ cantidadDinero+" [USD] equivalen a: "+ dolarACop.conversion_result()+" [COP]");
                    break;
                case 6://COP - USD
                    System.out.println("Ingresa la cantidad de Pesos Colombianos a convertir: ");
                    cantidadDinero = tecladoDineroIngresado.nextDouble();
                    Moneda copADolar = conversion.convertirCantidadADolar(pesoArs,cantidadDinero);
                    System.out.println("Los "+cantidadDinero+" [COP] equivalen a: "+copADolar.conversion_result()+" [USD]");
                    break;
                case 7:
                    System.out.println("El programa del conversor, ha finalizado.");
                    salir = true;
                break;
            }
        }


    }
}
