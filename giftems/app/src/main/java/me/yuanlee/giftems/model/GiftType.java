package me.yuanlee.giftems.model;

/**
 * Created by Y-Lee on 2017.07.12.
 */

public class GiftType implements Comparable<GiftType> {
    public int id;
    public String name;
    public String pic;
    public int orderNum;
    @Override
    public int compareTo(GiftType another) {
        return orderNum < another.orderNum ? - 1
                : (orderNum == another.orderNum ? 0 : 1);
    }
}
