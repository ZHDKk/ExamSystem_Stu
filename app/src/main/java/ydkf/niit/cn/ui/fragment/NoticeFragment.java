package ydkf.niit.cn.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
import org.w3c.dom.Text;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import ydkf.niit.cn.bean.NoticeBean;
import ydkf.niit.cn.ui.activity.R;

/**
 * Created by zhdk on 2016/12/2.
 */
@EFragment(R.layout.fragment_notice)
public class NoticeFragment extends BaseFragment {
    public static String NOTICE_FRAGMENT = "notice_fragment";

    @ViewById(R.id.not_recV)
    RecyclerView not_recV;
    List<NoticeBean> list;

    public static NoticeFragment newInstance(String msg) {
        NoticeFragment noticeFragment = new NoticeFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(NOTICE_FRAGMENT, msg);
        noticeFragment.setArguments(bundle);
        return noticeFragment;
    }

    @AfterViews
    void getNotContent() {
        list = new ArrayList<>();
        list.add(new NoticeBean("阿里起诉刷单平台", "傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元"));
        list.add(new NoticeBean("苹果披露无人驾驶汽车", "苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇"));
        list.add(new NoticeBean("终于来啦", "苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车"));
        list.add(new NoticeBean("阿里起诉刷单平台", "傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元"));
        list.add(new NoticeBean("苹果披露无人驾驶汽车", "苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇"));
        list.add(new NoticeBean("终于来啦", "苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车"));
        list.add(new NoticeBean("阿里起诉刷单平台", "傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元"));
        list.add(new NoticeBean("苹果披露无人驾驶汽车", "苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇"));
        list.add(new NoticeBean("终于来啦", "苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车"));
        list.add(new NoticeBean("阿里起诉刷单平台", "傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元"));
        list.add(new NoticeBean("苹果披露无人驾驶汽车", "苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇"));
        list.add(new NoticeBean("终于来啦", "苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车"));
        list.add(new NoticeBean("阿里起诉刷单平台", "傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元"));
        list.add(new NoticeBean("苹果披露无人驾驶汽车", "苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇"));
        list.add(new NoticeBean("终于来啦", "苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车"));
        list.add(new NoticeBean("阿里起诉刷单平台", "傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元傻退网索赔216万元"));
        list.add(new NoticeBean("苹果披露无人驾驶汽车", "苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇苹果希望拥有传统汽车厂商同等待遇"));
        list.add(new NoticeBean("终于来啦", "苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车苹果无人驾驶汽车"));


        not_recV.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyAdapter myAdapter = new MyAdapter(list);
        not_recV.setAdapter(myAdapter);
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
        List<NoticeBean> list;

        public MyAdapter(List<NoticeBean> list) {
            this.list = list;
        }

        @Override
        public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view
                    = LayoutInflater.from(getActivity()).inflate(R.layout.notice_item, null);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyAdapter.MyViewHolder holder, final int position) {

            holder.tv_title.setText(list.get(position).getTitle());
            holder.tv_content.setText(list.get(position).getContent());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date curDate = new Date(System.currentTimeMillis());//获取当前时间
            String str = formatter.format(curDate);
            holder.tv_time.setText(str);
//            holder.itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Toast.makeText(getActivity(), "11111" + list.get(position).getContent(), Toast.LENGTH_SHORT).show();
//                }
//            });
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            private TextView tv_title;
            private TextView tv_content;
            private TextView tv_time;

            public MyViewHolder(View itemView) {
                super(itemView);
                tv_title = (TextView) itemView.findViewById(R.id.tv_notice_title);
                tv_content = (TextView) itemView.findViewById(R.id.tv_notice_content);
                tv_time = (TextView) itemView.findViewById(R.id.tv_notice_time);
            }

        }
    }

}
