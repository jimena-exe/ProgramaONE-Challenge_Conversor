import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMoneda {
    private String apiKey ="172ff18e14654294517a5334";

    //Cantidad en general a USD
    public Moneda convertirCantidadADolar (String pesoBase, double cantidadMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+pesoBase+"/USD/"+cantidadMoneda); //dirección de la API

        //cliente
        HttpClient client= HttpClient.newHttpClient();
        //Request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);
        }catch (Exception e){
            throw new RuntimeException("No pude hacer la conversión que deseas");
        }
    }

    //Conversion de USD a moneda general y la cantidad
    public Moneda convertirDolar (String pesoAConvertir, double cantidadDolar){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/USD/"+pesoAConvertir+"/"+cantidadDolar);
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }catch (Exception e){
            throw new RuntimeException("No pude hacer la conversión que deseas");
        }


    }

}
