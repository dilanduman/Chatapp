package com.alan.uochatapp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class FragmentsPagerAdapter {
    public FragmentsPagerAdapter(FragmentManager fm) {

    }

    public abstract Fragment getItem(int i);

    public abstract int getCount();

    @Nullable
    public abstract CharSequence getPageTitle(int position);
}
