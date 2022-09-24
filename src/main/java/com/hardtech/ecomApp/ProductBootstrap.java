package com.hardtech.ecomApp;

import com.hardtech.ecomApp.models.Product;
import com.hardtech.ecomApp.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductBootstrap implements CommandLineRunner {

    private final ProductRepository productRepository;

    void saveProducts() {
        productRepository.save(new Product(null, "Ordinateur HP", 450000));
        productRepository.save(new Product(null, "Ecran LED", 200000));
        productRepository.save(new Product(null, "IPhone XR", 240000));
    }

    void printPorducts() {
        productRepository.findAll()
                .forEach(product -> System.out.println(product.getName()));
    }

    @Override
    public void run(String... args) throws Exception {
        saveProducts();
        printPorducts();
    }
}
