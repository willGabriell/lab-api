package me.dio.lab_api.domain.repository;

import me.dio.lab_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
