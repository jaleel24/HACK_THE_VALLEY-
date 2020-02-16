package com.example.lineup.ui.queue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.lineup.R;
import com.example.lineup.ui.queue.QueueViewModel;

import java.util.List;
import java.util.Queue;

public class QueueFragment extends Fragment {

    private QueueViewModel QueueViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        QueueViewModel =
                ViewModelProviders.of(this).get(QueueViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_queue, container, false);
        return root;

       // Queue line =  R.id.list;
    }


}