package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BudgetFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    View view;
    final ViewGroup nullParent = null;

    public BudgetFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.recycle, nullParent);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        final ArrayList<Card> budget = new ArrayList<>();
        budget.add(new Card( R.drawable.budgetcaf1, R.string.budget_cafe_1, R.string.budget_cafe_desc_1));
        budget.add(new Card( R.drawable.budgetcaf2, R.string.budget_cafe_2, R.string.budget_cafe_desc_2));
        budget.add(new Card( R.drawable.budgetcaf3, R.string.budget_cafe_3, R.string.budget_cafe_desc_3));
        budget.add(new Card( R.drawable.budgetcaf4, R.string.budget_cafe_4, R.string.budget_cafe_desc_4));
        budget.add(new Card( R.drawable.budgetcaf5, R.string.budget_cafe_5, R.string.budget_cafe_desc_5));
        budget.add(new Card( R.drawable.budgetcaf6, R.string.budget_cafe_6, R.string.budget_cafe_desc_6));
        budget.add(new Card( R.drawable.budgetcaf7, R.string.budget_cafe_7, R.string.budget_cafe_desc_7));
        budget.add(new Card( R.drawable.budgetcaf8, R.string.budget_cafe_8, R.string.budget_cafe_desc_8));
        budget.add(new Card( R.drawable.budgetcaf9, R.string.budget_cafe_9, R.string.budget_cafe_desc_9));
        budget.add(new Card( R.drawable.budgetcaf10, R.string.budget_cafe_10, R.string.budget_cafe_desc_10));

        adapter = new CardAdapter(budget);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
