package com.xdclass.shop.common;

public class OrderCouponDto {

    private String couponCode;
    private Integer orderId;
    private Integer userId;

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrderCouponDto{" +
                "couponCode='" + couponCode + '\'' +
                ", orderId=" + orderId +
                ", userId=" + userId +
                '}';
    }

    public OrderCouponDto(String couponCode, Integer orderId, Integer userId) {
        this.couponCode = couponCode;
        this.orderId = orderId;
        this.userId = userId;
    }

    public OrderCouponDto() {
    }
}
