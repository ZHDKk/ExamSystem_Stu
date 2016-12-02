package ydkf.niit.cn.ui.activity;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import ydkf.niit.cn.ui.fragment.BaseFragment;
import ydkf.niit.cn.ui.fragment.ExamFragment;
import ydkf.niit.cn.ui.fragment.ExamFragment_;
import ydkf.niit.cn.ui.fragment.NoticeFragment;
import ydkf.niit.cn.ui.fragment.NoticeFragment_;
import ydkf.niit.cn.ui.fragment.PersonalFragment;
import ydkf.niit.cn.ui.fragment.PersonalFragment_;
import ydkf.niit.cn.utils.StatusBarUtil;


@EActivity(R.layout.activity_main)
public class MainActivity extends AppActivity implements BottomNavigationBar.OnTabSelectedListener {
    @ViewById(R.id.bottom_navigationBar)
    BottomNavigationBar bottom_navigationBar;
    @ViewById(R.id.layFrame)
    FrameLayout frameLayout;
    ExamFragment examFragment;
    NoticeFragment noticeFragment;
    PersonalFragment personalFragment;

    @AfterViews
    void initViews() {
        examFragment = new ExamFragment_();
        noticeFragment = new NoticeFragment_();
        personalFragment = new PersonalFragment_();
        bottom_navigationBar.setMode(BottomNavigationBar.MODE_SHIFTING).setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        bottom_navigationBar.addItem(new BottomNavigationItem(R.mipmap.navigation_notice, getString(R.string.notice)).setActiveColorResource(R.color.colorPrimaryDark))
                .addItem(new BottomNavigationItem(R.mipmap.navigation_exam, getString(R.string.exam)).setActiveColorResource(R.color.colorPrimary))
                .addItem(new BottomNavigationItem(R.mipmap.navigation_personal, getString(R.string.personal)).setActiveColorResource(R.color.colorAccent)).setFirstSelectedPosition(1).initialise();
        bottom_navigationBar.setTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(int position) {
        switch (position) {
            case 0:
                StatusBarUtil.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
                if (noticeFragment == null) {
                    noticeFragment = NoticeFragment_.newInstance(getString(R.string.notice));
                }
                addFragment(noticeFragment);
                break;
            case 1:
                StatusBarUtil.setColor(this, getResources().getColor(R.color.colorPrimary));
                if (examFragment == null) {
                    examFragment = ExamFragment_.newInstance(getString(R.string.exam));
                }
                addFragment(examFragment);
                break;
            case 2:
                StatusBarUtil.setColor(this, getResources().getColor(R.color.colorAccent));
                if (personalFragment == null) {
                    personalFragment = PersonalFragment_.newInstance(getString(R.string.personal));
                }
                addFragment(personalFragment);
                break;
            default:
                break;
        }
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }

    @Override
    protected BaseFragment getFirstFragment() {
        if (examFragment == null) {
            examFragment = ExamFragment_.newInstance(getString(R.string.exam));
        }
        return examFragment;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        removeFragment();
    }
}
