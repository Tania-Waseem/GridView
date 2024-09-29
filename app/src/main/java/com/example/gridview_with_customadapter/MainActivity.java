package com.example.gridview_with_customadapter;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private CustomGridAdapter adapter;
    private List<Grid_Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        itemList = new ArrayList<>();
        itemList.add(new Grid_Item(R.drawable.camera, "Camera"));
        itemList.add(new Grid_Item(R.drawable.camera_roll, "Camera Roll"));
        itemList.add(new Grid_Item(R.drawable.featured, "Featured"));
        itemList.add(new Grid_Item(R.drawable.my_videos, "My Videos"));
        itemList.add(new Grid_Item(R.drawable.like, "Likes"));
        itemList.add(new Grid_Item(R.drawable.watch_later, "Watch Later"));
        itemList.add(new Grid_Item(R.drawable.stats, "Stats"));
        itemList.add(new Grid_Item(R.drawable.subscription, "Subscription"));
        itemList.add(new Grid_Item(R.drawable.help, "Help"));


        adapter = new CustomGridAdapter(this, itemList);
        gridView.setAdapter(adapter);

    }
}
