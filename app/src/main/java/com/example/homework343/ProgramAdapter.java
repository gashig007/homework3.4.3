package com.example.homework343;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProgramAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<String> programs;

    public ProgramAdapter(ArrayList<String> programs) {
        this.programs = programs;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProgramViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_programm, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder.bind(programs.get(position));
    }

    @Override
    public int getItemCount() {
        return programs.size();
    }


    class ProgramViewHolder extends RecyclerView.ViewHolder {
        private TextView program;

        public ProgramViewHolder(@NonNull View itemView) {
            super(itemView);
            program = itemView.findViewById(R.id.program);
        }

        public void bind(String program) {
            this.program.setText(program);
        }
    }
}
