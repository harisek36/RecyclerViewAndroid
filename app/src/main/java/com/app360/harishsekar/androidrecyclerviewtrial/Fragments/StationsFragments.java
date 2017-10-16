package com.app360.harishsekar.androidrecyclerviewtrial.Fragments;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app360.harishsekar.androidrecyclerviewtrial.Adapters.stationsAdapter;

import com.app360.harishsekar.androidrecyclerviewtrial.R;
import com.app360.harishsekar.androidrecyclerviewtrial.Services.DataService;


public class StationsFragments extends Fragment {

    private static final String ARG_STATION_TYPE = "StationType";



    public static final int STATION_TYPE_FEATURED=0;
    public static final int STATION_TYPE_RECENT = 1;
    public static final int STATION_TYPE_PARTY = 2;


    private int StationType_check;

//    private OnFragmentInteractionListener mListener;

    public StationsFragments() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param stationType_given  the Radio Stations Type.

     * @return A new instance of fragment StationsFragments.
     */

    public static StationsFragments newInstance(int stationType_given) {
        StationsFragments fragment = new StationsFragments();
        Bundle args = new Bundle();
        args.putInt(ARG_STATION_TYPE,stationType_given);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

            StationType_check = getArguments().getInt(ARG_STATION_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_stations_fragments, container, false);
        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recycler_station_ID);
        recyclerView.setHasFixedSize(true);

        stationsAdapter adapter;

        if(StationType_check == STATION_TYPE_FEATURED){
            adapter = new stationsAdapter(DataService.getInstance().getFeaturedStationData());
        }else if(StationType_check == STATION_TYPE_RECENT){
            adapter = new stationsAdapter(DataService.getInstance().getRecentStationData());
        }else {
            adapter = new stationsAdapter(DataService.getInstance().getParyyStationData());
        }


        recyclerView.addItemDecoration(new HorizontalSpaceItemDecorator(50));
       recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);


        return v;
    }


}

class HorizontalSpaceItemDecorator extends RecyclerView.ItemDecoration {

    private final int spacer;

    public HorizontalSpaceItemDecorator(int spacer) {
        this.spacer = spacer;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.right = spacer;
        outRect.left = spacer;
    }
}
