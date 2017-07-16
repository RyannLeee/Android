package me.yuanlee.giftems.model;

/**
 * Created by Y-Lee on 2017.07.16.
 */

public class Strategy implements Comparable<Strategy> {
    public int id;
    public String title;
    public String remark;
    public String pic1;
    public String pic2;
    public String pic3;
    public String pic4;
    public String pic5;
    public String content;
    public String createdTime;
    @Override
    public int compareTo(Strategy another) {
        return createdTime.compareTo(another.createdTime);
    }
}
