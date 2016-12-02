package ydkf.niit.cn.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;


import ydkf.niit.cn.ui.activity.R;

/**
 * Created by zhdk on 2016/11/30.
 */
@EFragment(R.layout.fragment_location)
public class LocationFragment extends Fragment {
    @ViewById(R.id.tv_content)
    TextView tv_content;

    public LocationFragment() {
    }

    public static LocationFragment newInstance(String param1) {
        LocationFragment fragment = new LocationFragment();
        Bundle args = new Bundle();
        args.putString("param", param1);
        fragment.setArguments(args);
        return fragment;
    }

    @AfterViews
    void getFmName() {
        Bundle bundle = getArguments();
        String FmName = bundle.getString("param");
        tv_content.setText(FmName + "");
    }


}
