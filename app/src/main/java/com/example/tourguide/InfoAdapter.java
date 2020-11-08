package com.example.tourguide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoAdapter extends BaseExpandableListAdapter{

    Context context;
    List<String> data;
    Map<String, List<String>> dataInfo;
    public InfoAdapter(Context context, List<String> data, Map<String, List<String>> dataInfo) {
        this.context = context;
        this.data=data;
        this.dataInfo=dataInfo;
    }

    @Override
    public int getGroupCount() {

            return data.size();

    }

    @Override
    public int getChildrenCount(int groupPosition) {
       return dataInfo.get(data.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return data.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return dataInfo.get(data.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String data=(String) getGroup(groupPosition);
        if (convertView==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_parent,null);
        }

        TextView txtParent=(TextView) convertView.findViewById(R.id.text_parent);
        txtParent.setText(data);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String dataInfo=(String) getChild(groupPosition,childPosition);
        if (convertView==null){
            LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_child,null);
        }


        TextView txtChild=(TextView) convertView.findViewById(R.id.text_child);
        txtChild.setText(dataInfo);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
