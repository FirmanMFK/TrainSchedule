package id.makers.app.trainschedule.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import id.makers.app.trainschedule.R;
import id.makers.app.trainschedule.api.KeretaApiService;
import id.makers.app.trainschedule.model.data_stasiun.DataStasiun;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Firman on 4/11/2017.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "HomeActivityTAG";
    private DataStasiun dataStasiun;
    private Retrofit retrofit;
    private EditText editTextAsalKeberangkatan;
    private EditText editTextTujuanKeberangkatan;
    private EditText editTextTanggalKeberangkatan;
    private Button buttonCekJadwalKeberangkatan;

    private List<String> listNamaKotaStasiun;
    private List<String> listValueNamaKotaStasiun;
    private List<String> listNamaKotaBesar;
    private String valueKotaAsal;
    private String valueKotaTujuan;
    private String valueTanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        EventBus.getDefault().register(this);
        initializedRetrofit();
        loadComponent();
        loadData();
    }

    private void initializedRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(KeretaApiService.baseApiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    private void loadComponent() {
        editTextAsalKeberangkatan = (EditText) findViewById(R.id.edit_text_kota_asal_activity_home);

    }


    private void loadData() {
    }


    @Override
    public void onClick(View v) {

    }
}
