package com.dossmann.recyclerviewforhuman;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder>{

    private ArrayList<People> PeopleTab;

    public PeopleAdapter(ArrayList<People> _peopleTab){
        this.PeopleTab = _peopleTab;
    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View peopleView = inflater.inflate(R.layout.people_layout, parent, false);

        return new PeopleViewHolder(peopleView);

    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        TextView textViewName = holder.textViewName;
        TextView textViewDescription = holder.textViewDesciption;

        textViewName.setText(PeopleTab.get(position).getName());
        textViewDescription.setText(PeopleTab.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return PeopleTab.size();
    }

    class PeopleViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;
        public TextView textViewDesciption;

        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.row_name);
            textViewDesciption = itemView.findViewById(R.id.row_description);
        }
    }
}

