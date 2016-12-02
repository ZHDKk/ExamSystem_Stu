package ydkf.niit.cn.ui.fragment;

import android.os.Bundle;
import android.view.View;

import org.androidannotations.annotations.EFragment;

import ydkf.niit.cn.ui.activity.R;

/**
 * Created by zhdk on 2016/12/2.
 */
@EFragment(R.layout.fragment_personal)
public class PersonalFragment extends BaseFragment {

    public static String PERSONAL_FRAGMENT = "personal_fragment";

    public static PersonalFragment newInstance(String msg) {
        PersonalFragment personalFragment = new PersonalFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(PERSONAL_FRAGMENT, msg);
        personalFragment.setArguments(bundle);
        return personalFragment;
    }

}
