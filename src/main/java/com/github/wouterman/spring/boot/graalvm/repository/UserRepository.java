package com.github.wouterman.spring.boot.graalvm.repository;

import com.github.wouterman.spring.boot.graalvm.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
