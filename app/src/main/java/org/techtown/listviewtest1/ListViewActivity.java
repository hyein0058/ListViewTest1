package org.techtown.listviewtest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import org.techtown.listviewtest1.adapter.ListViewAdapter;
import org.techtown.listviewtest1.adapter.SampleData;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    ListAdapter adapter;
    ArrayList<SampleData> listSampleData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        initSampleData();

        listView = (ListView) findViewById(R.id.listView);
        adapter = new ListViewAdapter(getApplicationContext(), listSampleData);
        listView.setAdapter(adapter);

    }

    public void initSampleData() {
        listSampleData = new ArrayList<SampleData>();

        listSampleData.add(new SampleData("1", "name1", "body1"));
        listSampleData.add(new SampleData("2", "name2", "body2"));
        listSampleData.add(new SampleData("3", "name3", "body3"));
        listSampleData.add(new SampleData("4", "name4", "body4"));
        listSampleData.add(new SampleData("5", "name5", "body5"));
        listSampleData.add(new SampleData("6", "name6", "body6"));
        listSampleData.add(new SampleData("7", "name7", "body7"));
        listSampleData.add(new SampleData("8", "name8", "body8"));
        listSampleData.add(new SampleData("9", "name9", "body9"));
        listSampleData.add(new SampleData("10", "name10", "body10"));
        listSampleData.add(new SampleData("11", "name11", "body11"));
        listSampleData.add(new SampleData("12", "name12", "body12"));
        listSampleData.add(new SampleData("13", "name13", "body13"));
        listSampleData.add(new SampleData("14", "name14", "body14"));
        listSampleData.add(new SampleData("15", "name15", "body15"));
        listSampleData.add(new SampleData("16", "name16", "body16"));
        listSampleData.add(new SampleData("17", "name17", "body17"));
        listSampleData.add(new SampleData("18", "name18", "body18"));
        listSampleData.add(new SampleData("19", "name19", "body19"));
        listSampleData.add(new SampleData("20", "name20", "body20"));
    }
}