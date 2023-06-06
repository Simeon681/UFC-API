package com.monyo.ufc.service.impl;

import com.monyo.ufc.controller.resources.CategoryResource;
import com.monyo.ufc.entity.Category;
import com.monyo.ufc.entity.Fighter;
import com.monyo.ufc.repository.CategoryRepository;
import com.monyo.ufc.repository.FighterRepository;
import com.monyo.ufc.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.monyo.ufc.mapper.CategoryMapper.CATEGORY_MAPPER;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final FighterRepository fighterRepository;

    @Override
    public List<CategoryResource> findAll() {
        return CATEGORY_MAPPER.toCategoryResources(categoryRepository.findAll());
    }

    @Override
    public CategoryResource getById(long id) {
        return CATEGORY_MAPPER.toCategoryResource(categoryRepository.getReferenceById(id));
    }

    @Override
    public CategoryResource save(CategoryResource resource) {
        Category category = CATEGORY_MAPPER.fromCategoryResource(resource);

        return CATEGORY_MAPPER.toCategoryResource(categoryRepository.save(category));
    }

    @Override
    public CategoryResource update(CategoryResource categoryResource, long id) {
        Category toUpdate = categoryRepository.getReferenceById(id);
        toUpdate.setName(categoryResource.getName());

        return CATEGORY_MAPPER.toCategoryResource(categoryRepository.save(toUpdate));
    }

    @Override
    public Optional<Category> getCategoryByName(String name) {
        return categoryRepository.getCategoriesByName(name);
    }

    @Override
    public void delete(long id) {
        fighterRepository.findAllByCategory_Id(id).forEach(this::removeCategory);
        categoryRepository.deleteById(id);
    }

    public void removeCategory(Fighter fighter) {
        fighter.setCategory(null);
        fighterRepository.save(fighter);
    }
}
