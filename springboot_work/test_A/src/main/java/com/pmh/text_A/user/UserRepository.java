package com.pmh.text_A.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    //select * from where email = ?  구문을 나타냄
    Optional<User> findByEmail (String email);
}
