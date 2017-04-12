package id.makers.app.trainschedule.model.data_jadwal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Firman on 4/12/2017.
 */

public class Kereta {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("class")
    @Expose
    private String _class;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }
}
