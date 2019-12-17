package com.example.listview_static;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView show = (TextView) findViewById(R.id.textView_show);

        ListView listView = (ListView) findViewById(R.id.listView);
        String[] values = new String[]{
                "item1", "item2", "item3", "item4"
        };
        List<String> list_values = new ArrayList<String>(Arrays.asList(values));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list_values);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectitem = (String) parent.getItemAtPosition(position);
                show.setText("你選擇了:"+selectitem);
            }
        });
}
}