package com.example.administrator.recview;

/**
 * Created by DELL on 2017/9/18.
 */

public class InfoSinger {
    private String Info;
    private boolean Status;

//    public  InfoSinger(String info,boolean status){
//        this.Info=info;
//        this.Status=status;
//    }
    public InfoSinger setInfo(String info,boolean status){
        InfoSinger t1=new InfoSinger();
        t1.Info=info;
        t1.Status=status;
        return  t1;
    }

    public String getInfo() {
        return Info;
    }

    public void
    setInfo(String info) {
        Info = info;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}
