package com.example.lineup.ui.queue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.lineup.R;
import com.example.lineup.ui.queue.QueueViewModel;

public class QueueFragment extends Fragment {

    private QueueViewModel QueueViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        QueueViewModel =
                ViewModelProviders.of(this).get(QueueViewModel.class);
        View root = inflater.inflate(R.layout.fragment_professors, container, false);
//        final Button button = root.findViewById(R.id.button_submit);
        return root;
    }


}