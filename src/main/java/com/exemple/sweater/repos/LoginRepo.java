package com.exemple.sweater.repos;

import com.exemple.sweater.domain.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepo extends CrudRepository<Login, Integer> {
}
