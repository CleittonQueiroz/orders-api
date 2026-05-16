package br.com.cleittonqueiroz.orders_api.repositories;

import br.com.cleittonqueiroz.orders_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
