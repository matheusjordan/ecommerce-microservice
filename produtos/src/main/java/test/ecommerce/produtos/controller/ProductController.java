package test.ecommerce.produtos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import test.ecommerce.produtos.model.Product;

@Controller
public class ProductController {

    public ResponseEntity<Product> create(Product product){

        return new ResponseEntity<Product>(HttpStatus.CREATED);
    }

    public ResponseEntity<Product> read(Product product){

        return new ResponseEntity<Product>(HttpStatus.FOUND);
    }

    public ResponseEntity<Product> update(Product product){

        return new ResponseEntity<Product>(HttpStatus.OK);
    }

    public ResponseEntity<Product> delete(Product product){

        return new ResponseEntity<Product>(HttpStatus.OK);
    }
}
