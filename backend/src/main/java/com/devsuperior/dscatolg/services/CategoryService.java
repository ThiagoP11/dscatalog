package com.devsuperior.dscatolg.services;

import com.devsuperior.dscatolg.entities.Category;
import com.devsuperior.dscatolg.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//registra a classe como um componente que vai participar um sistema de injeção de dependencia do spring
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        List<Category> list = repository.findAll();
        return list;
    }

}
