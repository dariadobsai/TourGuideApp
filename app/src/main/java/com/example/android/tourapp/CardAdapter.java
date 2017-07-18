package com.example.android.tourapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.CardView;

import java.util.ArrayList;

class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private ArrayList<Card> list;

    CardAdapter(ArrayList<Card> rate) {
        this.list = rate;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card, viewGroup, false);
        ViewHolder viewH = new ViewHolder(v);
        return viewH;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        final Card card = list.get(position);
        viewHolder.name.setText(card.getLine1());
        viewHolder.description.setText(card.getLine2());
        viewHolder.place.setImageResource(card.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, description;
        ImageView place;
        CardView card;

        ViewHolder(final View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            description = (TextView) itemView.findViewById(R.id.description);
            place = (ImageView) itemView.findViewById(R.id.place);
            card = (CardView) itemView.findViewById(R.id.cv);
        }
    }
}
