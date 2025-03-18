package com.example.MomoLogWeb.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    public Category() {}

    public Category(Long id, String name, List<StoreInfo> storeInfoList, String imageName) {
        this.id = id;
        this.name = name;
        this.storeInfoList = storeInfoList;
        this.imageName = imageName;
    }

    // カテゴリーID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    //カテゴリー名
    @Column(name = "category_name")
    private String name;

    @OneToMany(
            mappedBy = "category",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<StoreInfo> storeInfoList = new ArrayList<>();

    // 画像名
    private String imageName;

    public Category(Long id, String imageName) {
        this.id = id;
        this.imageName = imageName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;}

    public void setStoreInfoList(List<StoreInfo> storeInfoList) {
        this.storeInfoList = storeInfoList;
    }

    @Override
    public String toString() {
        return "Category {" +
                "id=" + id + '\'' +
                ", name=" + name + '\'' +
                ", imageName" + imageName + '\'' +
                '}';
    }
}
