package com.dipen.plannerapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.dipen.plannerapp.ui.Daily.DailyFragment;

public class PagerAdapter extends FragmentPagerAdapter {
    private int tabsNumber;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior, int tabs) {
        super(fm, behavior);
        this.tabsNumber = tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new DailyFragment();
            case 1:
                return new WeeklyFragment();
          /*case 2:
                return new MonthlyFragment();*/
                default: return null;
        }
        //return null;

    }

    @Override
    public int getCount() {
        return tabsNumber;
    }
}
