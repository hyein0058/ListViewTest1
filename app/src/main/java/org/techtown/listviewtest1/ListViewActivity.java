package org.techtown.listviewtest1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import org.techtown.listviewtest.adapter.ListViewAdapter;
import org.techtown.listviewtest.adapter.SampleData;

import java.util.ArrayList;

public class ListViewActivity extends Activity {

    ListView listview;
    ListViewAdapter adapter;
    ArrayList<SampleData> listSampleData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        initSampleData();


        listview = (ListView) findViewById(R.id.listview);

        adapter = new ListViewAdapter(getApplicationContext(), listSampleData);

        listview.setAdapter(adapter);

    }


    public void initSampleData() {
        listSampleData = new ArrayList<SampleData>();

        listSampleData.add(new SampleData("1","name1","body1"));
        listSampleData.add(new SampleData("2","name2","body2"));
        listSampleData.add(new SampleData("3","name3","body3"));
        listSampleData.add(new SampleData("4","name4","body4"));
        listSampleData.add(new SampleData("5","name5","body5"));
        listSampleData.add(new SampleData("6","name6","body6"));
        listSampleData.add(new SampleData("7","name7","body7"));
        listSampleData.add(new SampleData("8","name8","body8"));
        listSampleData.add(new SampleData("9","name9","body9"));
        listSampleData.add(new SampleData("10","name10","body10"));
        listSampleData.add(new SampleData("11","name11","body11"));
        listSampleData.add(new SampleData("12","name12","body12"));
        listSampleData.add(new SampleData("13","name13","body13"));
        listSampleData.add(new SampleData("14","name14","body14"));
        listSampleData.add(new SampleData("15","name15","body15"));
        listSampleData.add(new SampleData("16","name16","body16"));
        listSampleData.add(new SampleData("17","name17","body17"));
        listSampleData.add(new SampleData("18","name18","body18"));
        listSampleData.add(new SampleData("19","name19","body19"));
        listSampleData.add(new SampleData("20","name20","body20"));

    }
}
