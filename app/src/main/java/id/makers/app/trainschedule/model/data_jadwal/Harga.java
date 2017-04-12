package id.makers.app.trainschedule.model.data_jadwal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Firman on 4/12/2017.
 */

public class Harga {
    @SerializedName("rp")
    @Expose
    private String rp;
    @SerializedName("subclass")
    @Expose
    private String subclass;

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }
}
