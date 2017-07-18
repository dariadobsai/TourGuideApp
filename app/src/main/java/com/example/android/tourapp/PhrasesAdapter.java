package com.example.android.tourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import butterknife.ButterKnife;

class PhrasesAdapter extends ArrayAdapter<ListPhrases> {

    TextView placeNameTextView;
    TextView descriptionTextView;

    PhrasesAdapter(@NonNull Activity context, ArrayList<ListPhrases> phrases) {
        super(context, 0, phrases);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_phrases, parent, false);
        }
        ListPhrases place_item = getItem(position);
        placeNameTextView = ButterKnife.findById(listItemView, R.id.french);
        descriptionTextView = ButterKnife.findById(listItemView, R.id.english);
        assert place_item != null;
        placeNameTextView.setText(place_item.getFrench());
        descriptionTextView.setText(place_item.getEnglish());
        return listItemView;
    }
}
