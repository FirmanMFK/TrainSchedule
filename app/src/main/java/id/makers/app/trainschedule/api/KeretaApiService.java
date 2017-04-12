package id.makers.app.trainschedule.api;

import id.makers.app.trainschedule.model.data_stasiun.DataStasiun;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Firman on 4/11/2017.
 */

public interface KeretaApiService {

    public final String baseApiUrl = "http://ibacor.com";
    public final String apiKey = "";

    @GET("api/kereta-api")
    Call<DataStasiun> getDataStasiun(@Query("k") String apiKey);

    @GET("api/kereta-api")
    Call<ResponseBody> getDataJadwal(
            @Query("tanggal") String tanggal,
            @Query("asal") String asal,
            @Query("tujuan") String tujuan,
            @Query("k") String apiKey
    );
}
