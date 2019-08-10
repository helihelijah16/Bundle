package com.example.bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import javax.xml.validation.Validator;

public class DetailActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    Pegawai pegawaiDetail;
    TabFragmentPagerAdaptor pagerAdaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        Intent intent = getIntent();
        pegawaiDetail = (Pegawai) intent.getSerializableExtra("pegawainya");
        pagerAdaptor=new TabFragmentPagerAdaptor(getSupportFragmentManager(),pegawaiDetail);
        viewPager.setAdapter(pagerAdaptor);
        tabLayout.setTabTextColors(getResources().getColor(R.color.colora),getResources().getColor(R.color.colorb));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
