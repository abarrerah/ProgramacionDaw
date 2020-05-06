
package Tarea7;

import Tarea7.Futbolista;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface InfoPlayers {

    @GET("futbolistas_api_demo/jugadores")
    Call<List<Futbolista>> infoPlayers();


}