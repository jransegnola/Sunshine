package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Indicates which view to inflate into parent view
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        //Sample Data
        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Sunny - 88/63",
                "Wednesday - Sunny - 88/63"};

        //Initialing a new List with the array.
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));


        //Adapter used to populate data into a view. Used for data translation
        mForecastAdapter = new ArrayAdapter<String>(
                //Gets the current context (fragment's parent activity)
                getActivity(),
                //ID of list item layout
                R.layout.list_item_forecast,
                //ID of the textview to populate
                R.id.list_item_forecast_textview,
                //forecast data
                weekForecast);

        ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
