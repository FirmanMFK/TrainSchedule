package id.makers.app.trainschedule.model.data_jadwal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Firman on 4/11/2017.
 */

public class Berangkat {
    @SerializedName("jam")
    @Expose
    private String jam;
    @SerializedName("tanggal")
    @Expose
    private String tanggal;
    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
