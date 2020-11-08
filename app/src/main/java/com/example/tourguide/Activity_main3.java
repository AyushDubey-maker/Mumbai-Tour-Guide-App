package com.example.tourguide;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Activity_main3 extends AppCompatActivity {
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
        data.add("The Fern - Goregaon");
        data.add("Grand Hyatt Mumbai Hotel & Residences");
        data.add("The Oberoi Mumbai");
        data.add("Trident, Bandra Kurla, Mumbai");
        data.add("JW Marriott Mumbai Sahar");
        data.add("The Lalit Mumbai");
        List<String> GOI=new ArrayList<>();
        List<String> MarineDrive=new ArrayList<>();
        List<String> ElephantaCaves=new ArrayList<>();
        List<String> SanjayGandhiNationalPark=new ArrayList<>();
        List<String> ShriSiddhiVinayakGanapatiMandir=new ArrayList<>();
        List<String> HajiAliDargah=new ArrayList<>();

        GOI.add("4/277, I.B Patel Road Pahadi Road, Village, behind H.P Petrol Pump, Goregaon, Mumbai, Maharashtra 400063");
        GOI.add("For Booking:-(Phone): 022 2685 5000");
        MarineDrive.add("Address: Bandra Kurla Complex Vicinity, Off Western Express Highway, Santacruz East, Mumbai, Maharashtra 400055");
        MarineDrive.add("Phone: 022 6676 1234");
        ElephantaCaves.add("Address: Nariman Point, Mumbai, Maharashtra 400021 ");
        ElephantaCaves.add("Phone: 022 6632 5757");
        SanjayGandhiNationalPark.add("Address: C 56, G Block BKC, Bandra Kurla Complex, Bandra East, Mumbai, Maharashtra 400098");
        SanjayGandhiNationalPark.add("Phone: 022 6672 7777");
        ShriSiddhiVinayakGanapatiMandir.add("Address: Chhatrapati Shivaji International Airport, IA Project Rd, Navpada, Vile Parle East, Vile Parle, Andheri, Maharashtra 400099");
        ShriSiddhiVinayakGanapatiMandir.add("Phone: 022 6882 8888");
        HajiAliDargah.add("Address: Sahar Airport Rd, Navpada, Marol, Andheri East, Mumbai, Maharashtra 400059");
        HajiAliDargah.add("Phone: 022 6699 2222");
        dataInfo.put(data.get(0),GOI);
        dataInfo.put(data.get(1),MarineDrive);
        dataInfo.put(data.get(2),ElephantaCaves);
        dataInfo.put(data.get(3),SanjayGandhiNationalPark);
        dataInfo.put(data.get(4),ShriSiddhiVinayakGanapatiMandir);
        dataInfo.put(data.get(5),HajiAliDargah);


    }
}
