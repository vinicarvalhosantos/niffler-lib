package br.com.vinicius.santos.nifflerlib.request;

import br.com.vinicius.santos.nifflerlib.model.TwitchTokenModel;
import br.com.vinicius.santos.nifflerlib.model.TwitchUserModel;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TwitchRequests {

    @POST("token")
    Call<TwitchTokenModel> getTwitchToken(@Query("client_id") String clientId, @Query("client_secret") String clientSecret,
                                          @Query("grant_type") String grantType);

    @GET("users")
    Call<TwitchUserModel> getTwitchUser(@Query("login") String username, @Header("Authorization") String authHeader,
                                              @Header("client-id") String clientId);

}
