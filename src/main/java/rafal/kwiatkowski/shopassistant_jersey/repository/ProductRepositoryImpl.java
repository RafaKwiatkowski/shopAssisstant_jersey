package rafal.kwiatkowski.shopassistant_jersey.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rafal.kwiatkowski.shopassistant_jersey.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Transactional
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        String hql = "FROM Product";
        return entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Product findOne(Integer id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public Product save(Product product) {
        entityManager.persist(product);
        return product;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public void delete(Integer id) {
        entityManager.remove(findOne(id));
    }

    @Override
    public void deleteAll() {

    }
}
