package com.example.satwik.roomie;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Daniel on 05-04-2017.
 */
public class PagerAdapter extends FragmentPagerAdapter{

    Context context=null;
    int noOfTabs;

    public PagerAdapter(Context context, FragmentManager manager,int noOfTabs)
    {
        super(manager);
        this.context=context;
        this.noOfTabs=noOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                StatsFragment tab1 = new StatsFragment();
                return tab1;
            case 1:
                GraphFragment tab2 = new GraphFragment();
                return tab2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
