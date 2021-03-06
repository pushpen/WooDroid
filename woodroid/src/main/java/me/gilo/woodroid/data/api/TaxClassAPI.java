package me.gilo.woodroid.data.api;


import me.gilo.woodroid.models.TaxClass;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface TaxClassAPI {

    @Headers("Content-Type: application/json")
    @POST("taxes/classes")
    Call<TaxClass> create(@Body TaxClass body);

    @GET("taxes/classes")
    Call<List<TaxClass>> list();

    @DELETE("taxes/classes/{id}")
    Call<TaxClass> delete(@Path("id") int id);

    @DELETE("taxes/classes/{id}")
    Call<TaxClass> delete(@Path("id") int id, @Query("force") boolean force);

    @GET("coupons")
    Call<ArrayList<TaxClass>> filter(@QueryMap Map<String, String> filter);

}