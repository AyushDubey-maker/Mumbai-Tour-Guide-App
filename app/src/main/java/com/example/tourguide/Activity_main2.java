package com.example.tourguide;


import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Activity_main2 extends AppCompatActivity {
        ExpandableListView expandablelistView;
        List<String> data;
    Map<String, List<String>> dataInfo;
    private int lastExpandedPosition = -1;
    ExpandableListAdapter listAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expand_view);

        expandablelistView = (ExpandableListView) findViewById(R.id.expandablelistview);
        fillData();
        listAdapter=new InfoAdapter(this,data,dataInfo);
        expandablelistView.setAdapter(listAdapter);
        //THIS {setOnGroupExpandListener IS USED TO SAVE SCREEN DATA}
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

         data.add("Gateway Of India");
         data.add("Marine Drive");
         data.add("Elephanta Caves");
         data.add("Sanjay Gandhi Park");
         data.add("Shri Siddhi Vinayak Ganapati Mandir");
         data.add("Haji Ali Dargah");
         List<String> GOI=new ArrayList<>();
         List<String> MarineDrive=new ArrayList<>();
        List<String> ElephantaCaves=new ArrayList<>();
        List<String> SanjayGandhiNationalPark=new ArrayList<>();
        List<String> ShriSiddhiVinayakGanapatiMandir=new ArrayList<>();
        List<String> HajiAliDargah=new ArrayList<>();

        GOI.add("NEAR:Apollo Bandar, Colaba, Mumbai, Maharashtra 400001");
         GOI.add("The Gateway of India is an arch-monument built in the early twentieth century in the city of Mumbai, in the Indian state of Maharashtra.");
         MarineDrive.add("Marine Drive is a 3.6-kilometre-long Promenade along the Netaji Subhash Chandra Bose Road in South Mumbai in the city of Mumbai, India.");
         ElephantaCaves.add("Elephanta Caves are a UNESCO World Heritage Site and a collection of cave temples predominantly dedicated to the Hindu god Shiva. ");
         SanjayGandhiNationalPark.add("Address:Western Express Hwy, Borivali East, Mumbai, Maharashtra 400066");
         SanjayGandhiNationalPark.add("Sanjay Gandhi National Park is a 87 km² protected area in Mumbai, Maharashtra State in India. It was established in 1996");
         ShriSiddhiVinayakGanapatiMandir.add("Address:SK Bole Marg, Prabhadevi, Mumbai, Maharashtra 400028");
         ShriSiddhiVinayakGanapatiMandir.add("The Shree Siddhivinayak Ganapati Mandir is a Hindu temple dedicated to Lord Shri Ganesh. ");
         HajiAliDargah.add("Address: Dargah Rd, Haji Ali, Mumbai, Maharashtra");
         HajiAliDargah.add("The Haji Ali Dargah is a mosque and dargah or the monument of Pir Haji Ali Shah Bukhari located on an islet off the coast of Worli in the southern part of Mumbai.");
         dataInfo.put(data.get(0),GOI);
         dataInfo.put(data.get(1),MarineDrive);
         dataInfo.put(data.get(2),ElephantaCaves);
         dataInfo.put(data.get(3),SanjayGandhiNationalPark);
         dataInfo.put(data.get(4),ShriSiddhiVinayakGanapatiMandir);
         dataInfo.put(data.get(5),HajiAliDargah);

    }
}






        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.



