package com.botscrew.bot.database.repository;

import com.botscrew.bot.database.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{

    boolean exists(String primaryKey);

    <S extends User> S save(S entity);


}
