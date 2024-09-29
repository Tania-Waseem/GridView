package com.example.gridview_with_customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomGridAdapter extends BaseAdapter {

    private Context context;
    private List<Grid_Item> itemsList;  // Use a list of Grid_Item objects

    public CustomGridAdapter(Context context, List<Grid_Item> items) {
        this.context = context;
        this.itemsList = items;
    }

    @Override
    public int getCount() {
        return itemsList.size();  // Return the size of the list
    }

    @Override
    public Object getItem(int position) {
        return itemsList.get(position);  // Return the Grid_Item at the given position
    }

    @Override
    public long getItemId(int position) {
        return position;  // Return the position as the ID (you can customize this if needed)
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_grid_item, parent, false);
        }

        // Get references to the ImageView and TextView in the grid item layout
        ImageView imageView = convertView.findViewById(R.id.icon);
        TextView textView = convertView.findViewById(R.id.iconText);

        // Set the image and text for each grid item
        Grid_Item currentItem = itemsList.get(position);
        imageView.setImageResource(currentItem.getImageResId());
        textView.setText(currentItem.getText());

        return convertView;
    }
}
