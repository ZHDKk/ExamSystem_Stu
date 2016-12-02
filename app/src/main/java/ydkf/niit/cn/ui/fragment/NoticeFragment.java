package ydkf.niit.cn.ui.fragment;

import android.os.Bundle;
import android.view.View;

import org.androidannotations.annotations.EFragment;

import ydkf.niit.cn.ui.activity.R;

/**
 * Created by zhdk on 2016/12/2.
 */
@EFragment(R.layout.fragment_notice)
public class NoticeFragment extends BaseFragment {
    public static String NOTICE_FRAGMENT = "notice_fragment";

    public static NoticeFragment newInstance(String msg) {
        NoticeFragment noticeFragment = new NoticeFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(NOTICE_FRAGMENT, msg);
        noticeFragment.setArguments(bundle);
        return noticeFragment;
    }

}
