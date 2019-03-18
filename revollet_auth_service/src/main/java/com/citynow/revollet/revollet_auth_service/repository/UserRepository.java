package com.citynow.revollet.revollet_auth_service.repository;

import com.citynow.revollet.revollet_auth_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Transactional
    Optional<User> findByUsername(String username);

}
