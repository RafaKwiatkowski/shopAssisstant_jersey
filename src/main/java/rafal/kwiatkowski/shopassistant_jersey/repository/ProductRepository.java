package rafal.kwiatkowski.shopassistant_jersey.repository;

import rafal.kwiatkowski.shopassistant_jersey.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    Product findOne(Integer id);

    Product save(Product product);

    Product update(Integer id, Product product);

    void delete(Integer id);

    void deleteAll();
}
