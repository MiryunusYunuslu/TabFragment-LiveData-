package com.example.tabfragment.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tabfragment.R;
import com.example.tabfragment.ViewModel.ViewModelPager;


public class SecondFragment extends Fragment {
    private ViewModelPager viewModelPager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModelPager= ViewModelProviders.of(requireActivity()).get(ViewModelPager.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_second,container,false);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView=view.findViewById(R.id.textview);
        viewModelPager.getName().observeForever(new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s.toString());
            }
        });
    }
}