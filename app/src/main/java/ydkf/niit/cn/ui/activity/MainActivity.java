package ydkf.niit.cn.ui.activity;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import ydkf.niit.cn.ui.fragment.LocationFragment;
import ydkf.niit.cn.ui.fragment.LocationFragment_;


@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity implements BottomNavigationBar.OnTabSelectedListener {
    @ViewById(R.id.bottom_navigationBar)
    BottomNavigationBar bottom_navigationBar;
    @ViewById(R.id.layFrame)
    FrameLayout frameLayout;
    LocationFragment mLocationFragment;

    @AfterViews
    void setBngBar() {
        bottom_navigationBar.addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "通知").setActiveColor(Color.BLUE))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "考试").setActiveColor(Color.GRAY))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "个人").setActiveColor(Color.GREEN));
        bottom_navigationBar.setTabSelectedListener(this);
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.layFrame, LocationFragment_.builder().build());
        transaction.commit();
    }

    @Override
    public void onTabSelected(int position) {
        FragmentManager fm = getSupportFragmentManager();
        //开启事务
        FragmentTransaction transaction = fm.beginTransaction();
        switch (position) {
//            case 0:
//                if (mLocationFragment == null) {
//                    mLocationFragment = LocationFragment.newInstance("通知");
//                }
//                transaction.replace(R.id.tb, mLocationFragment);
//                break;
//            case 1:
//                if (mFindFragment == null) {
//                    mFindFragment = FindFragment.newInstance("考试");
//                }
//                transaction.replace(R.id.tb, mFindFragment);
//                break;
//            case 2:
//                if (mFavoritesFragment == null) {
//                    mFavoritesFragment = FavoritesFragment.newInstance("个人");
//                }
//                transaction.replace(R.id.tb, mFavoritesFragment);
//                break;
//            default:
//                break;
        }
        // 事务提交
        transaction.commit();
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}
