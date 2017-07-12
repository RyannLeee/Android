package me.yuanlee.giftems.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y-Lee on 2017.07.12.
 */

public class Order {
    public static final int PAY_SUCCESS = 1;
    public static final int PAY_CLOSED = 2;
    public static final int PAY_DAIZHIFU = 3;
    public static final int PAY_YIZHIFU = 4;
    public static final int PAY_DENGDAIDAIFU = 5;
    public static final int PAY_DAIFUWANCHENG = 6;
    public static final int PAY_DAIFAHUO = 7;
    public static final int PAY_YIFAHUO = 8;
    public static final int PAY_TUIHUO = 9;
    public Integer id;
    public String orderNo;
    public String deliveryNo;
    public String deliveryName;
    public String transNo;
    public Integer userId;
    public String userName;
    public String receiverName;
    public String receiverPhone;
    public String receiverAddress;
    public String arriveDate;
    public Float price;
    public String payTime;
    public String createTime;
    public String expiredTime;
    public Integer status;
    public String orderInfo;
    public String attachInfo;

    public Integer deleted;
    public Integer couponItemId;
    public List<OrderItem> items = new ArrayList<OrderItem>();
    public String specifyTime;
    public String specifyFlag;
    public String leaveWords;
    public String leaveSound;
    private String statusName;
    public String getStatusName() {
        if (statusName == null || statusName.length() == 0) {
            switch (status) {
                case PAY_SUCCESS:
                    statusName = "交易成功";
                    break;
                case PAY_CLOSED:
                    statusName = "交易关闭";
                    break;
                case PAY_DAIZHIFU:
                    statusName = "等待支付";
                    break;
                case PAY_YIZHIFU:
                    statusName = "已支付";
                    break;
                case PAY_DENGDAIDAIFU:
                    statusName = "等待代付";
                    break;
                case PAY_DAIFUWANCHENG:
                    statusName = "代付成功";
                    break;
                case PAY_DAIFAHUO:
                    statusName = "待发货";
                    break;
                case PAY_YIFAHUO:
                    statusName = "已发货";
                    break;
                case PAY_TUIHUO:
                    statusName = "退货中";
                    break;
            }
        }
        return statusName;
    }
}
