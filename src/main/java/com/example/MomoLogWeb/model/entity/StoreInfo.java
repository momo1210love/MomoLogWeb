package com.example.MomoLogWeb.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Store_Info")
public class StoreInfo {

    @Id
    @GeneratedValue
    // 店舗ID
    private Long id;

    public StoreInfo(){}

    // 店舗名
    @Column(name = "name")
    private String name;

    // 住所
    @Column(name = "address")
    private String address;

    // 電話番号
    @Column(name = "tel")
    private String tel;

    // 営業時間
    @Column(name = "open_Time")
    private String openTime;

    // 定休日
    @Column(name = "holiday")
    private String holiday;

    // カテゴリーID
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // 画像名
    @Column(name = "image_Name")
    private String imageName;

    public StoreInfo(String name, String address, String tel, String openTime, String holiday, Long categoryId, String imageName) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.openTime = openTime;
        this.holiday = holiday;
        this.category = category;
        this.imageName = imageName;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category categoryId) {
        this.category = categoryId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "StoreInfo {" +
                "id=" + id + + '\'' +
                ", name=" + name + + '\'' +
                ", openTime='" + openTime + '\'' +
                ", holiday='" + holiday + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", category='" + category + '\'' +
                "' imageName" + imageName + '\'' +
                '}';
    }
}