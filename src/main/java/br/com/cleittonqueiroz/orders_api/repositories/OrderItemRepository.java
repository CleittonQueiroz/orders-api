package br.com.cleittonqueiroz.orders_api.repositories;

import br.com.cleittonqueiroz.orders_api.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
