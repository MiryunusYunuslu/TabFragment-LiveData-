package com.example.tabfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tabfragment.Adapter.PageAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabItem frag1, frag2;
    private TabLayout tabLayout;
    private PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        pageAdapter=new PageAdapter(getSupportFragmentManager(),2);
        viewPager.setAdapter(pageAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            viewPager.setCurrentItem(tab.getPosition());
            if(tab.getPosition()==0 || tab.getPosition()==1){
                pageAdapter.notifyDataSetChanged();
            }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initialize() {
        tabLayout = findViewById(R.id.tablayout);
        frag1 = findViewById(R.id.fragment1);
        frag2 = findViewById(R.id.fragment2);
        viewPager=findViewById(R.id.fragmentcontainer);
    }
}