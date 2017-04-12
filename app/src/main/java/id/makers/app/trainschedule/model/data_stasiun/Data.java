package id.makers.app.trainschedule.model.data_stasiun;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Firman on 4/12/2017.
 */

public class Data {
    @SerializedName("tanggal")
    @Expose
    private java.util.List<Tanggal> tanggal = null;
    @SerializedName("stasiun")
    @Expose
    private java.util.List<Stasiun> stasiun = null;

    public java.util.List<Tanggal> getTanggal() {
        return tanggal;
    }

    public void setTanggal(java.util.List<Tanggal> tanggal) {
        this.tanggal = tanggal;
    }

    public java.util.List<Stasiun> getStasiun() {
        return stasiun;
    }

    public void setStasiun(java.util.List<Stasiun> stasiun) {
        this.stasiun = stasiun;
    }
}

