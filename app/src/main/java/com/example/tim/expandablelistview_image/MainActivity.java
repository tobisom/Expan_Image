package com.example.tim.expandablelistview_image;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Main activity class that will demonstrate ExpandableListView
 */
public class MainActivity extends AppCompatActivity
        implements ExpandableListView.OnGroupClickListener, ExpandableListView.OnChildClickListener,
        ExpandableListView.OnGroupExpandListener,ExpandableListView.OnGroupCollapseListener   {
    ExpandableListView elvMyListView;
    MyExpandableAdapter adapter;
    ArrayList<Continent> continents = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elvMyListView = (ExpandableListView) findViewById(R.id.elvMyListView);
        continents = new ArrayList<>();
        continents = populateContinentData(continents);

        adapter = new MyExpandableAdapter(this, continents);
        elvMyListView.setAdapter(adapter);
        elvMyListView.setOnGroupClickListener(this);
        elvMyListView.setOnChildClickListener(this);
        elvMyListView.setOnGroupExpandListener(this);
        elvMyListView.setOnGroupCollapseListener(this);
    }

    /**
     * Method used to populate continent data
     * @param continents
     * @return
     */
    private ArrayList<Continent> populateContinentData(ArrayList<Continent> continents) {
        // Asia Continent
        Continent asiaContinent = new Continent(1, "Asia", null, R.drawable.asia);
        ArrayList<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("India",  1, R.drawable.asia_india));
        asiaCountries.add(new Country("Pakistan", 2, R.drawable.asia_pakistan));
        asiaCountries.add(new Country("Seria", 3, R.drawable.asia_seria));
        asiaCountries.add(new Country("Sri Lanka", 4, R.drawable.asia_srilanka));
        asiaCountries.add(new Country("Vietnam",  5, R.drawable.asia_vietnam));
        asiaContinent.setCountry(asiaCountries);
        continents.add(asiaContinent);

        //Europe continent
        Continent europeContinent = new Continent(2, "Europe", null, R.drawable.europe);
        ArrayList<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("United Kingdom",  6, R.drawable.europe_unitedkingdom));
        europeCountries.add(new Country("France",  7, R.drawable.europe_france));
        europeCountries.add(new Country("Germany",  8, R.drawable.europe_germany));
        europeCountries.add(new Country("Iceland",  9, R.drawable.europe_iceland));
        europeCountries.add(new Country("Italy", 10, R.drawable.europe_italy));
        europeContinent.setCountry(europeCountries);
        continents.add(europeContinent);

        // Africa
        Continent africaContinent = new Continent(3, "Africa",  null, R.drawable.africa);
        ArrayList<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country("South Africa" ,11, R.drawable.africa_southafrica));
        africaCountries.add(new Country("Ethiopia", 12, R.drawable.africa_ethiopia));
        africaCountries.add(new Country("Kenya", 13, R.drawable.africa_kenya));
        africaCountries.add(new Country("Morocco", 14, R.drawable.africa_moroco));
        africaCountries.add(new Country("Nigeria", 15, R.drawable.africa_nigeria));
        africaContinent.setCountry(africaCountries);
        continents.add(africaContinent);
        return continents;
    }

    @Override
    public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long l) {
        Country c = adapter.getChild(groupPosition, childPosition);
        //Toast.makeText(MainActivity.this, "Your clicked " + c.getName() + " of Group " + adapter.getGroup(groupPosition).getName(), Toast.LENGTH_SHORT).show();
        if(groupPosition == 0 && childPosition == 0){
            Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
startActivity(intent);
        }
        else if (groupPosition == 1 && childPosition == 1){
            Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
            startActivity(intent);
        }

        return false;
    }

    @Override
    public boolean onGroupClick(ExpandableListView expandableListView, View view, int groupPosition, long l) {

        return false;
    }

    @Override
    public void onGroupExpand(int groupPosition) {


    }

    @Override
    public void onGroupCollapse(int groupPosition) {


    }
}