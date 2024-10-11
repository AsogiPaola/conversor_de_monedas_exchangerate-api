package com.aluracursos.api;

import com.aluracursos.monedas.ConversorDeMonedas;
import com.aluracursos.monedas.InfoMonedas;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticiones {
    //private String key = System.getenv().get("4eb6648806143a3d7addb2c7");

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting().create();

    public InfoMonedas getConvertMoney(String base_code, String target_code, Double value) throws IOException, InterruptedException{
        String url = "https://v6.exchangerate-api.com/v6/4eb6648806143a3d7addb2c7/pair/"+base_code+"/"+target_code+"/"+value;
        //System.out.println(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        ConversorDeMonedas conversor = gson.fromJson(response.body(), ConversorDeMonedas.class);
        return new InfoMonedas(conversor);
    }
}
