package org.init.domain.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.init.domain.model.User;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {



}
