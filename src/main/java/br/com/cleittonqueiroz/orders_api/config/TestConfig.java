package br.com.cleittonqueiroz.orders_api.config;

import br.com.cleittonqueiroz.orders_api.entities.User;
import br.com.cleittonqueiroz.orders_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run (String... args) throws Exception{

        User u1 = new User(null, "Cleiton Queiroz", "Cleiton@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Cristina Queiroz", "Cristina@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
