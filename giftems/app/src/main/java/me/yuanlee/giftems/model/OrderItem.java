package me.yuanlee.giftems.model;

/**
 * Created by Y-Lee on 2017.07.12.
 */

public class OrderItem {
    public Integer id;
    public Integer orderId;
    public Integer giftId;
    public String giftName;
    public Integer giftCount;
    public Integer styleId;
    public String stytleName;
    public float discount;
    public float stylePrice;
    public String remark;
    public String stylePic1;
    public Order order;
}
