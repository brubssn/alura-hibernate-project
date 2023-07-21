package br.com.alura.store.dao;

import br.com.alura.store.model.Category;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoryDao {
    private EntityManager em;

    public CategoryDao(EntityManager em){
        this.em = em;
    }
    public void add(Category category){
        this.em.persist(category);
    }
    public void update(Category category){
        this.em.merge(category);
    }
    public void delete(Category category){
        em.merge(category);
        this.em.remove(category);
    }
    public Category searchById(Long id){
        return em.find(Category.class, id);
    }
    public List<Category> searchAll(){
        String jpql = "SELECT c FROM Category c";
        return em.createQuery(jpql, Category.class).getResultList();
    }
    public List<Category> searchByName(String name){
        String jpql = "SELECT c FROM Category c WHERE c.name = :name";
        return em.createQuery(jpql, Category.class)
                .setParameter("name", name)
                .getResultList();
    }
}
