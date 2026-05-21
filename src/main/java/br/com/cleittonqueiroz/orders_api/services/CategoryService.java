package br.com.cleittonqueiroz.orders_api.services;

import br.com.cleittonqueiroz.orders_api.entities.Category;
import br.com.cleittonqueiroz.orders_api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return  repository.findAll();

    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }


}
