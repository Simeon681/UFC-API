package com.monyo.ufc.service;

import com.monyo.ufc.controller.resources.CategoryResource;
import com.monyo.ufc.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryResource> findAll();

    CategoryResource getById(long id);

    CategoryResource save(CategoryResource resource);

    CategoryResource update(CategoryResource categoryResource, long id);

    Optional<Category> getCategoryByName(String name);

    void delete(long id);
}
