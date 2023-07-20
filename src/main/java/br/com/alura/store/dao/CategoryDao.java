package br.com.alura.store.dao;

import br.com.alura.store.model.Category;
import br.com.alura.store.model.Product;

import javax.persistence.EntityManager;

public class CategoryDao {
    private EntityManager em;

    public CategoryDao(EntityManager em) {
        this.em = em;
    }

    public void add(Category category){
        this.em.persist(category);
    }
}
