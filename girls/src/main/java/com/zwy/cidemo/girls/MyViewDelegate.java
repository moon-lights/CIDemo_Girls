package com.zwy.cidemo.girls;

import android.support.annotation.Keep;
import android.view.View;

import com.zwy.base.base.BaseFragment;
import com.zwy.base.base.IViewDelegate;

@Keep
public class MyViewDelegate implements IViewDelegate {

    @Override
    public BaseFragment getFragment(String name) {
        return GirlsFragment.newInstance();
    }

    @Override
    public View getView(String name) {
        return null;
    }
}
