package com.app360.harishsekar.androidrecyclerviewtrial.Services;

import com.app360.harishsekar.androidrecyclerviewtrial.model_data.Station;

import java.util.ArrayList;

/**
 * Created by harishsekar on 10/13/17.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }


    public ArrayList<Station> getFeaturedStationData(){
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));
        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        list.add(new Station("Flight Plan (Tunes for Travel)","flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking Playlist)","bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));


        return list;
    }

    public ArrayList<Station> getRecentStationData(){
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Title_One_Featured","flightplanmusic"));
        list.add(new Station("Title_Two","bicyclemusic"));
        list.add(new Station("Kids Music","kidsmusic"));

        return list;
    }

    public ArrayList<Station> getParyyStationData(){
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Title_One_Featured","flightplanmusic"));
        list.add(new Station("Title_Two","bicyclemusic"));
        list.add(new Station("Kids Music","kidsmusic"));

        return list;
    }
}
