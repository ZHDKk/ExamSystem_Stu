package ydkf.niit.cn.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;



@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.tv)
    TextView tv_name;

    @Click(R.id.showName)
    public void showName() {
        Toast.makeText(this, "nihao ", Toast.LENGTH_SHORT).show();
    }

}
