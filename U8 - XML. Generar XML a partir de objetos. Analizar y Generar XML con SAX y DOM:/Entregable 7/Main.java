package Tarea7;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://my-json-server.typicode.com/chemaduran/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        InfoPlayers service = retrofit.create(InfoPlayers.class);

        System.out.println("Obtenemos el listado completo de jugadores");

        try {
            Response<List<Futbolista>> response = service.infoPlayers().execute();
            if (response.isSuccessful()){
                List<Futbolista> futbolistas = response.body();
                System.out.println(futbolistas);
            } else {
                System.out.println("Petición no valida: " + response.message());
            }
        } catch (Exception e){
            System.out.println("Error -> " + e.getMessage());
        }

    }
}
