package com.example.MomoLogWeb.model.repository;

import com.example.MomoLogWeb.model.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
