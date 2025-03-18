package com.example.MomoLogWeb.model.remote;

import com.example.MomoLogWeb.model.entity.Category;
import com.example.MomoLogWeb.model.entity.StoreInfo;
import com.example.MomoLogWeb.model.repository.CategoryRepository;
import com.example.MomoLogWeb.model.repository.StoreInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApiController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private StoreInfoRepository storeInfoRepository;

    /**
     * カテゴリー一覧の取得API
     *
     * @return カテゴリー一覧
     */
    @GetMapping("/api/v1/category/list")
    public List<Category> categoryList() {
        List<Category> categoryList = new ArrayList<>();
        //　カテゴリーの全てをリストで返す
        categoryRepository.findAll().forEach(categoryList::add);
        return categoryList;
    }

    /**
     *  店舗情報一覧取得API
     *
     *  ＠return 店舗一覧
     */
    @GetMapping("/api/v1/storeinfo/list")
    public List<StoreInfo> getStoreInfoAll() {
        List<StoreInfo> storeInfoList = new ArrayList<>();
        // 店舗情報の全てをリストで返す
        storeInfoRepository.findAll().forEach(storeInfoList::add);
        return storeInfoList;
    }
}
