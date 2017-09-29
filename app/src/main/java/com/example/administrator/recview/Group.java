package com.example.administrator.recview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/9/18.
 */


//初始化数据
public class Group {

     List<InfoSinger> InfoList=new ArrayList<>();

    public List<InfoSinger> init(){
        InfoSinger info1=new InfoSinger();
        info1.setInfo("jack");
        info1.setStatus(false);
        InfoList.add(info1);

        InfoSinger info2=new InfoSinger();
        info2.setInfo("rose");
        info2.setStatus(false);
        InfoList.add(info2);

        InfoSinger info3=new InfoSinger();
        info3.setInfo("rannnar");
        info3.setStatus(false);
        InfoList.add(info3);

        InfoSinger info4=new InfoSinger();
        info4.setInfo("Lisa");
        info4.setStatus(false);
        InfoList.add(info4);

        InfoSinger info5=new InfoSinger();
        info5.setInfo("张三");
        info5.setStatus(false);
        InfoList.add(info5);
        
        InfoSinger info6=new InfoSinger();
        info6.setInfo("李四");
        info6.setStatus(false);
        InfoList.add(info6);

        InfoSinger info7=new InfoSinger();
        info7.setInfo("王二麻子");
        info7.setStatus(false);
        InfoList.add(info7);

        InfoSinger info8=new InfoSinger();
        info8.setInfo("爱因斯坦");
        info8.setStatus(false);
        InfoList.add(info8);
        
        InfoSinger info9=new InfoSinger();
        info9.setInfo("贝克汉姆");
        info9.setStatus(false);
        InfoList.add(info9);
        
        InfoSinger info10=new InfoSinger();
        info10.setInfo("科比");
        info10.setStatus(false);
        InfoList.add(info10);
        
        InfoSinger info11=new InfoSinger();
        info11.setInfo("伊丽莎白");
        info11.setStatus(false);
        InfoList.add(info11);


        InfoSinger info12=new InfoSinger();
        info12.setInfo("威廉");
        info12.setStatus(false);
        InfoList.add(info12);

        InfoSinger info13=new InfoSinger();
        info13.setInfo("哈利王子");
        info13.setStatus(false);
        InfoList.add(info13);
        
        

        return InfoList;
    }
}
