package com.example.astroswin;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.os.Bundle;

import com.example.astroswin.Adapter.CustomListAdapter;
import com.example.astroswin.Model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView itemsListView  = (ListView)findViewById(R.id.list_view_items);

        //create adapter object
        CustomListAdapter adapter = new CustomListAdapter(this, generateItemsList());

        //set custom adapter as adapter to our list view
        itemsListView.setAdapter(adapter);
    }

    private ArrayList<Student> generateItemsList() {
        String itemNames[] = getResources().getStringArray(R.array.items_name);
        String itemDescriptions[] = getResources().getStringArray(R.array.item_description);
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Student(itemNames[i], itemDescriptions[i]));
        }

        return list;
    }
}

