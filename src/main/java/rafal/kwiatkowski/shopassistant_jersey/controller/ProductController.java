package rafal.kwiatkowski.shopassistant_jersey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rafal.kwiatkowski.shopassistant_jersey.model.Product;
import rafal.kwiatkowski.shopassistant_jersey.repository.ProductRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> findAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Product finProduct(@PathParam(value = "id") Integer id ) {
        Product product = productRepository.findOne(id);
        return product;
    }

}
