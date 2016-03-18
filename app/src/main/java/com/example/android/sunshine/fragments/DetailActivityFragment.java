package com.example.android.sunshine.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.sunshine.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent intent = getActivity().getIntent();
        View view =  inflater.inflate(R.layout.fragment_detail, container, false);
        if(intent != null && intent.hasExtra(Intent.EXTRA_TEXT)){
            String details = intent.getStringExtra(Intent.EXTRA_TEXT);
            Log.d("Boholst", details);
            ((TextView)view.findViewById(R.id.detail_text))
                    .setText(details);
        }
        return view;
    }
}
