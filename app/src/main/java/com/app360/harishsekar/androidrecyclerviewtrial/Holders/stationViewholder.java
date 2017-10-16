package com.app360.harishsekar.androidrecyclerviewtrial.Holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app360.harishsekar.androidrecyclerviewtrial.R;
import com.app360.harishsekar.androidrecyclerviewtrial.model_data.Station;

/**
 * Created by harishsekar on 10/13/17.
 */

public class stationViewholder extends RecyclerView.ViewHolder {


    private ImageView mainImage;
    private TextView mainText;

    public stationViewholder(View itemView) {
        super(itemView);


        this.mainImage = itemView.findViewById(R.id.main_image);
        this.mainText =  itemView.findViewById(R.id.main_Text);

    }

    public void updateUI(Station station){

        String uri = station.getUri();
        int resource = mainImage.getResources().getIdentifier(uri,null,mainImage.getContext().getPackageName());

        mainImage.setImageResource(resource);
        mainText.setText(station.getStation_Title());

    }
}
