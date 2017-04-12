package id.makers.app.trainschedule.activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import id.makers.app.trainschedule.model.data_jadwal.Datum;

/**
 * Created by Firman on 4/11/2017.
 */

public class AdapterJadwalKeretaApi extends RecyclerView.Adapter {

    public static final int ITEM_HEADER = 1;
    public static final int ITEM_CONTENT = 2;
    public static final int ITEM_FOOTER = 3;

    List<Datum> listDatum;
    List<Integer> listViewType;
    String kotaAsal;
    String kotaTujuan;

    public AdapterJadwalKeretaApi(List<Datum> listDatum,
                                  List<Integer> listViewType,
                                  String kotaAsal,
                                  String kotaTujuan) {
        this.listDatum = listDatum;
        this.listViewType = listViewType;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
