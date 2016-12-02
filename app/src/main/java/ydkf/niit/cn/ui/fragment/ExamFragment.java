package ydkf.niit.cn.ui.fragment;

import android.os.Bundle;
import android.view.View;

import org.androidannotations.annotations.EFragment;

import ydkf.niit.cn.ui.activity.R;

/**
 * Created by zhdk on 2016/12/2.
 */
@EFragment(R.layout.fragment_exam)
public class ExamFragment extends BaseFragment {
    public static String EXAM_FRAGMENT = "exam_fragment";

    public static ExamFragment newInstance(String msg) {
        ExamFragment examFragment = new ExamFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(EXAM_FRAGMENT, msg);
        examFragment.setArguments(bundle);
        return examFragment;
    }

}
