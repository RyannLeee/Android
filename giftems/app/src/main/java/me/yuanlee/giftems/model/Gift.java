package me.yuanlee.giftems.model;

import java.util.ArrayList;

/**
 * Created by Y-Lee on 2017.07.12.
 */

public class Gift {
    public int id;
    public String name;
    public String remark;
    public int likes;
    public int sales;
    public boolean collected;
    public ArrayList<GiftStyle> styles = new ArrayList<GiftStyle>();
}
