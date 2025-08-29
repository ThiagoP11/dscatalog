package com.devsuperior.dscatolog.services;

import com.devsuperior.dscatolog.entities.Category;
import com.devsuperior.dscatolog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//registra a classe como um componente que vai participar um sistema de injeção de dependencia do spring
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<Category> findAll() {
        List<Category> list = repository.findAll();
        return list;
    }

}
