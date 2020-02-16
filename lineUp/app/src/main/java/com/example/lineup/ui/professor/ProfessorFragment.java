package com.example.lineup.ui.professor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.lineup.R;

public class ProfessorFragment extends Fragment {

    private ProfessorViewModel professorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        professorViewModel =
                ViewModelProviders.of(this).get(ProfessorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_professors, container, false);
        final Button button = root.findViewById(R.id.button_submit);

        return root;
    }


}