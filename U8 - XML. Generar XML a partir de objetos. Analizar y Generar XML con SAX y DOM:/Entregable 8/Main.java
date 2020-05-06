package Tarea8;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://my-json-server.typicode.com/chemaduran/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        InfoAlumno svc= retrofit.create(InfoAlumno.class);

        System.out.println("Vamos a obtener el listado de alumnos");

        try {
            Response <List<Alumno>> response=svc.listaAlumnos().execute();
            if (response.isSuccessful()){
                List<Alumno> alumnos=response.body();
                System.out.println(alumnos);
            }else {
                System.out.println("Error"+response.message());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
