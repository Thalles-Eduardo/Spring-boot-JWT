package br.com.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.jwt.model.user.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long>{
    UserDetails findByLogin(String login);
}
