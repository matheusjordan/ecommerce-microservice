package test.ecommerce.produtos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import test.ecommerce.produtos.model.Product;
import test.ecommerce.produtos.repository.ProductRepository;


@Service
public class ProductService {
    private final Logger LOG = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository repository;

    public void create(Product product){
        LOG.info("creating product!");
        repository.save(product);
    }

    public Product read(Long id){
        LOG.info("reading product!");
        Product p = repository.findById(id).get();
        return p;
    }

    public void update(Product product){
        LOG.info("updating product!");
        repository.save(product);
    }

    public void delete(Long id){
        LOG.info("deleting product!");
        repository.deleteById(id);
    }

    public Iterable<Product> readAll(Pageable pageable){
        LOG.info("reading all products!");
        Iterable<Product> ps = repository.findAll(pageable);
        return ps;
    }
}
