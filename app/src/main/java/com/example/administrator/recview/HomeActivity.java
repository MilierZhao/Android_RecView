package com.example.administrator.recview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<String> mDatas;
    private HomeAdapter mAdapter;
    private Group group1=new Group();
    private List<InfoSinger> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//         initData();
         group1.init();
         mList=group1.InfoList;
         mRecyclerView=(RecyclerView)findViewById(R.id.id_recyclerview);
         mRecyclerView.setLayoutManager(new LinearLayoutManager(this));     //设置布局管理器
         mRecyclerView.setAdapter(mAdapter =new HomeAdapter());     //设置adapter
         mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));     //添加分割线

    }

        //给list初始化，添加数据
     protected  void initData(){
        mDatas=new ArrayList<>();
        for (int i='A';i<'k';i++){
            mDatas.add(""+(char)i);
        }
     }


    class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>
    {


        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
            HomeActivity.this).inflate(R.layout.item_home, parent,
                    false));
            return holder;
        }

        //获取数据长度
        @Override
        public int getItemCount() {
            return mList.size();
        }


        //将数据渲染在前端UI
        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.tv.setText(mList.get(position).getInfo());

            if(mList.get(position).isStatus()){
                holder.tv.setBackgroundColor(Color.parseColor("#EBEDA5"));
            }else {
                holder.tv.setBackgroundColor(0);
            }

        }


        //绑定布局
        class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView tv;

            public MyViewHolder(View view)
            {
                super(view);
                tv = (TextView) view.findViewById(R.id.id_num);
                tv.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                if (view.getId()==tv.getId()){
                    int position = getAdapterPosition();
                    for(int i = 0; i < mList.size(); i ++){
                        mList.get(i).setStatus(false);
                    }
                    mList.get(position).setStatus(true);
                    tv.setBackgroundColor(Color.parseColor("#EBEDA5"));
                }

                //刷新页面
                notifyDataSetChanged();
            }
        }
    }

}
