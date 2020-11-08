package com.example.tourguide;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Activity_main4 extends AppCompatActivity {
    ExpandableListView expandablelistView;
    List<String> data;
    Map<String, List<String>> dataInfo;
    ExpandableListAdapter listAdapter;
    private int lastExpandedPosition = -1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expand_view);

        expandablelistView = (ExpandableListView) findViewById(R.id.expandablelistview);
        fillData();
        listAdapter=new InfoAdapter(this,data,dataInfo);
        expandablelistView.setAdapter(listAdapter);
        expandablelistView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                if(lastExpandedPosition != -1 && groupPosition != lastExpandedPosition){
                    expandablelistView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });
    }  public void fillData(){
        data=new ArrayList<>();
        dataInfo= new HashMap<>();

        data.add("White Charcoal Fine Dine");
        data.add("Nawab Saheb");
        data.add("Fifty Five East");
        data.add("Namak - Indian Specialty Restaurant");
        data.add("The Earth Plate");
        data.add("JW Cafe");
        List<String> GOI=new ArrayList<>();
        List<String> MarineDrive=new ArrayList<>();
        List<String> ElephantaCaves=new ArrayList<>();
        List<String> SanjayGandhiNationalPark=new ArrayList<>();
        List<String> ShriSiddhiVinayakGanapatiMandir=new ArrayList<>();
        List<String> HajiAliDargah=new ArrayList<>();

        GOI.add(" 636, SAB TV Rd, Laxmi Industrial Estate, Suresh Nagar, Andheri West, Mumbai, Maharashtra 400053");
        GOI.add("Inventive Modern Indian cuisine offered in an elegant monochromatic space in an upscale hotel.");
        MarineDrive.add("Address: Renaissance Mumbai Convention Centre Hotel, 2&3B, near Chinmayanand Ashram, Powai, Mumbai, Maharashtra 400087");
        MarineDrive.add("Kebabs, curry dishes & other Indian fare served in an airy, contemporary hotel dining room.");
        ElephantaCaves.add("Address: Grand Hyatt, Off, Western Express Hwy, Santacruz East, Mumbai, Maharashtra 400055 ");
        ElephantaCaves.add("This sophisticated global restaurant in the Grand Hyatt is known for its hearty Sunday brunches.");
        SanjayGandhiNationalPark.add("Address: Hotel Sahara Star, opposite Terminal 1, Navpada, Vile Parle East, Vile Parle, Mumbai, Maharashtra 400099");
        SanjayGandhiNationalPark.add("Stylish hotel dining room with sophisticated decor & a menu of modern & classic Indian cuisine.");
        ShriSiddhiVinayakGanapatiMandir.add("Address: Hotel Sahara Star, Western Express Hwy, Service Rd, opposite Terminal 1, Vile Parle East, Mumbai, Maharashtra 400099");
        ShriSiddhiVinayakGanapatiMandir.add("Popular for Sunday brunches & breakfast, with Continental & Mexican cuisine in plush surrounds. ");
        HajiAliDargah.add("Address: Chhatrapati Shivaji International Airport Area, Vile Parle, Mumbai, Maharashtra 400099");
        HajiAliDargah.add("Lively buffet restaurant in an upscale hotel offering multi-cuisine fare & a popular Sunday brunch.");
        dataInfo.put(data.get(0),GOI);
        dataInfo.put(data.get(1),MarineDrive);
        dataInfo.put(data.get(2),ElephantaCaves);
        dataInfo.put(data.get(3),SanjayGandhiNationalPark);
        dataInfo.put(data.get(4),ShriSiddhiVinayakGanapatiMandir);
        dataInfo.put(data.get(5),HajiAliDargah);

    }
}

