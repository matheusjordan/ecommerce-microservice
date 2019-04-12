package test.ecommerce.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.ecommerce.produtos.model.Product;
import test.ecommerce.produtos.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/")
    public ResponseEntity<Product> create(Product product){
        service.create(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> read(@PathVariable( value = "id") Long id){
        Product p = service.read(id);
        return new ResponseEntity<>(p, HttpStatus.FOUND);
    }

    @PutMapping("/")
    public ResponseEntity<Product> update(Product product){
        service.update(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable( value = "id") Long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<Iterable<Product>> listAll(Pageable pageable){
        Iterable<Product> ps = service.readAll(pageable);
        return new ResponseEntity<>(ps, HttpStatus.OK);
    }
}
