import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMoneda {
    //        private String apiKey ="172ff18e14654294517a5334";
    //        public String pais = ""; double cantidadMoneda = 2300;

    public Moneda convertirCantidad (int cantidadMoneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/172ff18e14654294517a5334/pair/USD/COP/"+cantidadMoneda); //dirección de la API

        HttpClient client= HttpClient.newHttpClient(); //cliente
        //Request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);
        }catch (Exception e){
            throw new RuntimeException("No pude hacer la converción que deseas");
        }
    }









    //System.out.print(response.body());
//    https://v6.exchangerate-api.com/v6/172ff18e14654294517a5334/latest/USD  -- Cambia el apikey y el usd
//    https://v6.exchangerate-api.com/v6/172ff18e14654294517a5334/pair/USD/COP  -- este trae la conversión
//    https://v6.exchangerate-api.com/v6/172ff18e14654294517a5334/pair/USD/COP/84 -- el numero final trae el valor




}
