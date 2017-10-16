package com.app360.harishsekar.androidrecyclerviewtrial.model_data;

/**
 * Created by harishsekar on 10/13/17.
 */

public class Station {

    final String DRAWABLE = "drawable/";

    private String Station_Title;
    private String Uri;

    public Station(String station_Title, String uri) {
        Station_Title = station_Title;
        Uri = uri;
    }

    public String getStation_Title() {
        return Station_Title;
    }

    public String getUri() {
        return DRAWABLE+Uri;
    }
}
