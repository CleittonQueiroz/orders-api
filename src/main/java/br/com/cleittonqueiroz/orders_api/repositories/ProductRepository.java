package br.com.cleittonqueiroz.orders_api.repositories;

import br.com.cleittonqueiroz.orders_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
