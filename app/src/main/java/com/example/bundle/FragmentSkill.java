package com.example.bundle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentSkill extends Fragment {
    private Bundle bundle;
    private Pegawai pegawaiNyaa;
    private TextView txtNama3,txtAsalSekolah,txtKeahlian;

    public FragmentSkill() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawaiNyaa= (Pegawai) bundle.getSerializable("bungkus3");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_fragment_skill, container, false);
        txtNama3 = (TextView)view.findViewById(R.id.txt_nama);
        txtAsalSekolah= (TextView)view.findViewById(R.id.txt_asalSekolah);
        txtKeahlian = (TextView)view.findViewById(R.id.txt_keahlian);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama3.setText(pegawaiNyaa.getNama());
        txtAsalSekolah.setText(pegawaiNyaa.getAsalsekolah());
        txtKeahlian.setText(pegawaiNyaa.getKeahlian());

    }
}





