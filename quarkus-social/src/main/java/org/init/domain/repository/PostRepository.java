package org.init.domain.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.init.domain.model.Post;


@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {

}
