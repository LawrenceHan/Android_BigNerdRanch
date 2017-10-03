package com.example.hanguang.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Hanguang on 03/10/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
