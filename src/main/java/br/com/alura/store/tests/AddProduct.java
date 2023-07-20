package br.com.alura.store.tests;

import br.com.alura.store.dao.CategoryDao;
import br.com.alura.store.dao.ProductDao;
import br.com.alura.store.model.Category;
import br.com.alura.store.model.Product;
import br.com.alura.store.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class AddProduct {
    public static void main(String[] args) {
        Category smartphones = new Category("smartphones");

        Product smartphone = new Product("Xiaomi Redmi"
                , "Released 2013, August. 158g, 9.9 thickness. Android 4.2. 4GB 1GB RAM storage, microSDHC slot."
                , new BigDecimal("800")
                , smartphones);

        EntityManager em = JPAUtil.getEntityManager();
        CategoryDao categoryDao = new CategoryDao(em);
        ProductDao productDao = new ProductDao(em);

        em.getTransaction().begin();

        categoryDao.add(smartphones);
        productDao.add(smartphone);

        em.getTransaction().commit();
        em.close();
    }
}
