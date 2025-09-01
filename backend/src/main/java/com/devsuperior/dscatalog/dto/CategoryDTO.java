package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO() {

    }

    public CategoryDTO(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
