package com.example.projectmobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KomikFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class KomikFragment extends Fragment {
    private RecyclerView rvKomik;
    private ArrayList<Komik> listKomik = new ArrayList<>();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public KomikFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment KomikFragment.
     */
    // TODO: Rename and change types and number of parameters


    public static Fragment newInstance() {
        KomikFragment fragment = new KomikFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_komik, container, false);
        rvKomik = view.findViewById(R.id.rv_komik);
        rvKomik.setHasFixedSize(true);

        listKomik.addAll(Data.getListData());
        rvKomik.setLayoutManager(new GridLayoutManager(view.getContext(), 1));
        ListAdapter listAdapter = new ListAdapter(listKomik);
        rvKomik.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Komik X) {
                showSelectedKomik(X);
            }
        });
        return view;
    }

    private void showSelectedKomik(Komik X){

    }
    }
