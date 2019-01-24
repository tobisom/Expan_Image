package com.example.tim.expandablelistview_image;

/**
 * Created by Tim on 24.11.2017.
 */

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyExpandableAdapter implements ExpandableListAdapter {
    Context context = null;
    ArrayList<Continent> originalContinentList;
    ArrayList<Continent> continentList;

    public MyExpandableAdapter(Context context, ArrayList<Continent> data) {
        this.context = context;
        this.originalContinentList = new ArrayList<Continent>();
        this.originalContinentList.addAll(data);

        this.continentList = new ArrayList<Continent>();
        this.continentList.addAll(data);
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {}
    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {}
    @Override
    public void onGroupExpanded(int i) {}
    @Override
    public void onGroupCollapsed(int i) {}

    @Override
    public boolean isEmpty() {
        if (continentList.size() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int getGroupCount() {
        return continentList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return continentList.get(i).getCountry().size();
    }

    @Override
    public Continent getGroup(int i) {

        return continentList.get(i);
    }

    @Override
    public Country getChild(int groupPosition, int childPosition) {
        return continentList.get(groupPosition).getCountry().get(childPosition);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int position, boolean b, View contentView, ViewGroup parent) {

        Continent continent = continentList.get(position);
        if (contentView == null) {
            contentView = LayoutInflater.from(context).inflate(R.layout.continent_row, parent, false);
        }
        TextView tvContinentName = (TextView) contentView.findViewById(R.id.tvContinentName);
        ImageView imageView = (ImageView) contentView.findViewById(R.id.ivContinentFlag);
        imageView.setImageResource(continent.getFlag());
        tvContinentName.setText(continent.getName());


        return contentView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View contentView, ViewGroup parent) {
        Country country = continentList.get(groupPosition).getCountry().get(childPosition);
        if (contentView == null) {
            contentView = LayoutInflater.from(context).inflate(R.layout.country_row, parent, false);
        }
        TextView tvCountryName = (TextView) contentView.findViewById(R.id.tvCountryName);


        ImageView imageView = (ImageView) contentView.findViewById(R.id.ivCountryFlag);
        imageView.setImageResource(country.getFlag());

        tvCountryName.setText(country.getName());


        return contentView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public long getCombinedChildId(long l, long l1) {
        return l1;
    }

    @Override
    public long getCombinedGroupId(long l) {
        return l;
    }
}