package br.com.cleittonqueiroz.orders_api.repositories;

import br.com.cleittonqueiroz.orders_api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
