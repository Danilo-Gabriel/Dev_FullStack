package org.init.rest.dto;

import lombok.Getter;
import lombok.Setter;
import org.init.domain.model.User;


@Getter
@Setter
public class CreateFollowersRequest {

    private Long id;

    private Long user;

    private Long followersId;

}
