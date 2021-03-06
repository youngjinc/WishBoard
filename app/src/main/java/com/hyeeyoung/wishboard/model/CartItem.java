package com.hyeeyoung.wishboard.model;

public class CartItem {
    // @parmas : 서버와 연동하기 위해 사용될 변수
    private String user_id;
    private String item_id;

    private String item_image; // @parmas : 서버로부터 받아와 표시될 item_image
    private String item_name; // @parmas : 서버로부터 받아와 표시될 item_name
    private String item_price; // @parmas : 서버로부터 받아와 표시될 item_price
    private String item_count; // @parmas : 서버로부터 받아와 표시될 item_count
    private boolean isCheckCount = false; // @params : count 변경 시 사용 //default : false

    public CartItem() {
    }

    public CartItem(String user_id, String item_id) {
        this.user_id = user_id;
        this.item_id = item_id;
    }

    public String getUser_id() { return user_id; }

    public String getItem_id() { return item_id; }

    public String getItem_image() {
        return item_image;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getItem_price() {
        return item_price;
    }

    public String getItem_count() {
        return item_count;
    }

    public boolean isCheckCount() {
        return isCheckCount;
    }

    public void setUser_id(String user_id) { this.user_id = user_id; }

    public void setItem_id(String item_id) { this.item_id = item_id; }

    public void setItem_image(String item_image) {
        this.item_image = item_image;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public void setItem_count(String item_count) {
        this.item_count = item_count;
    }

    public void setCheckCount(boolean checkCount) {
        isCheckCount = checkCount;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "user_id='" + user_id + '\'' +
                ", item_id='" + item_id + '\'' +
                ", item_image='" + item_image + '\'' +
                ", item_name='" + item_name + '\'' +
                ", item_price='" + item_price + '\'' +
                ", item_count='" + item_count + '\'' +
                ", isCheckCount=" + isCheckCount +
                '}';
    }
}

