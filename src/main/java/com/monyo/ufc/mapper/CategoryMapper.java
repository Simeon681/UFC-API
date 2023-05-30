package com.monyo.ufc.mapper;

import com.monyo.ufc.controller.resources.CategoryResource;
import com.monyo.ufc.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = FighterMapper.class)
public interface CategoryMapper {
    CategoryMapper CATEGORY_MAPPER = Mappers.getMapper(CategoryMapper.class);
    Category fromCategoryResource(CategoryResource categoryResource);
    CategoryResource toCategoryResource(Category category);
    List<CategoryResource> toCategoryResources(List<Category> categories);
}
