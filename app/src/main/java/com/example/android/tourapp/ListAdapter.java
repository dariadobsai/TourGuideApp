package com.example.android.tourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;

class ListAdapter extends ArrayAdapter<List> {

   private TextView placeNameTextView;
   private TextView descriptionTextView;
   private ImageView imageView;

    ListAdapter(@NonNull Activity context, ArrayList<List> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // check if the current view is reused else inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        //get the object located at position
        List place_item = getItem(position);
        placeNameTextView = ButterKnife.findById(listItemView, R.id.place_name);
        descriptionTextView = ButterKnife.findById(listItemView, R.id.place_descrip);
        imageView = ButterKnife.findById(listItemView, R.id.pic);

        assert place_item != null;
        placeNameTextView.setText(place_item.getName());
        descriptionTextView.setText(place_item.getAddress());
        imageView.setImageResource(place_item.getPicture());
        return listItemView;
    }
}
