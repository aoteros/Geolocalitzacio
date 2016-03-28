package net.infobosccoma.titulars.network;

import net.infobosccoma.titulars.models.business.entities.PuntsInteres;

import retrofit.http.GET;
import retrofit.http.Path;

//import retrofit.http.DELETE;
//import retrofit.http.POST;
//import retrofit.http.PUT;

public interface TitularsAPI {

    @GET("/pois")
    PuntsInteres.Llista getAll();

    @GET("/pois/{city}")
    PuntsInteres.Llista getByCity(@Path("/pois/city") String city);

//    @POST("/titulars")
//    Response insert(@Path("titol") String titol, @Path("subtitol") String subtitol);
//
//    @PUT("/titulars/{id}")
//    Response update(@Path("id") int id, @Path("titol") String titol, @Path("subtitol") String subtitol);
//
//    @DELETE("/titulars/{id}")
//    Response delete(@Path("id") int id);


}
