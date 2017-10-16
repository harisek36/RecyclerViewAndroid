package com.app360.harishsekar.androidrecyclerviewtrial.Activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app360.harishsekar.androidrecyclerviewtrial.Fragments.MainFragment;
import com.app360.harishsekar.androidrecyclerviewtrial.Fragments.StationsFragments;
import com.app360.harishsekar.androidrecyclerviewtrial.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment) fm.findFragmentById(R.id.container_main);

        if(mainFragment == null){
            mainFragment = MainFragment.newInstance( "Blha","Blha");
            fm.beginTransaction().add(R.id.container_main,mainFragment).commit();
        }

    }



}
