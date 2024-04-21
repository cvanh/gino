package dev.imaretarded.gino.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.imaretarded.gino.domains.Product;

public interface ProductInterface extends JpaRepository<Product, Long> {

}
