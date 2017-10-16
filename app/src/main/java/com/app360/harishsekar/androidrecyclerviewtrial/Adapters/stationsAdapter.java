package com.app360.harishsekar.androidrecyclerviewtrial.Adapters;
import com.app360.harishsekar.androidrecyclerviewtrial.Holders.stationViewholder;
import com.app360.harishsekar.androidrecyclerviewtrial.R;
import com.app360.harishsekar.androidrecyclerviewtrial.model_data.Station;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by harishsekar on 10/13/17.
 */

public class stationsAdapter extends RecyclerView.Adapter<stationViewholder> {


    ArrayList<Station> stations;

    public stationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public stationViewholder onCreateViewHolder(ViewGroup parent, int viewType) {


        View stationCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station,parent,false);
        return new stationViewholder(stationCard);
    }

    @Override
    public void onBindViewHolder(stationViewholder holder, int position) {
        Station station = stations.get(position);
        holder.updateUI(station);




    }

    @Override
    public int getItemCount() {
        return stations.size();
    }
}
