package com.example.tabfragment.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabfragment.Fragment.FirrstFragment;
import com.example.tabfragment.Fragment.SecondFragment;

public class PageAdapter extends FragmentPagerAdapter {
    private int tabcount;

    public PageAdapter(FragmentManager fragmentManager, int behavior) {
        super(fragmentManager, behavior);
        tabcount = behavior;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FirrstFragment();
        } else {
            return new SecondFragment();
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
