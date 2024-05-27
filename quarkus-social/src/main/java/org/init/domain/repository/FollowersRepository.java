package org.init.domain.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.Parameter;
import org.init.domain.model.Followers;
import org.init.domain.model.User;

import javax.security.auth.login.Configuration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


@ApplicationScoped
public class FollowersRepository implements PanacheRepository<Followers> {

 /*
    public boolean follows(User follower, User user){
        Map<String, Object> params = new HashMap<>();
        params.put("follower", follower);
        params.put("user", user);
        find("follo");
        find("follower = :follower and user = :user ", params);
        Parameters.with("follower", follower).and("user", user).map();

        find("follower = :follower and user = :user", params);

    }

  */
}
