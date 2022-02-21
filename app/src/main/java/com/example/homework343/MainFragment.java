package com.example.homework343;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private ArrayList<String> programs;
    private RecyclerView recyclerView;
    private ProgramAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadProgram();
        recyclerView = view.findViewById(R.id.recycler);
        adapter = new ProgramAdapter(programs);
        recyclerView.setAdapter(adapter);
    }

    private void loadProgram() {
        programs = new ArrayList<>();
        programs.add("C++");
        programs.add("Python");
        programs.add("C#");
        programs.add("Java");
        programs.add("JavaScript");

    }
}