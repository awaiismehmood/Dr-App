package com.example.drapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTabs;

    public LoginAdapter(@NonNull FragmentManager fm,Context ct,int totalTabs) {
        super(fm);
        this.context=ct;
        this.totalTabs=totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                LogInTabFragment logInTabFragment=new LogInTabFragment();
                return logInTabFragment;
            case 1:
                SignUpTabFragment signUpTabFragment=new SignUpTabFragment();
                return signUpTabFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
