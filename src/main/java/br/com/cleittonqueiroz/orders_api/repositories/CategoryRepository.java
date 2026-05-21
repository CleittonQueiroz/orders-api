package br.com.cleittonqueiroz.orders_api.repositories;

import br.com.cleittonqueiroz.orders_api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
