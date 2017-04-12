package id.makers.app.trainschedule.model.data_stasiun;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Firman on 4/12/2017.
 */

public class Stasiun {

    @SerializedName("kota")
    @Expose
    private String kota;

    @SerializedName("list")
    @Expose
    private java.util.List<List> list = null;

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public java.util.List<List> getList() {
        return list;
    }

    public void setList(java.util.List<List> list) {
        this.list = list;
    }
}
