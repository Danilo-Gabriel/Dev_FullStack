package org.init.domain.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "followers")
public class Followers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "followers_id")
    private User followers;


}
