package org.init.rest.dto;


import lombok.Data;
import org.init.domain.model.Post;

import java.time.LocalDateTime;

@Data
public class PostResponse {

    private String text;
    private LocalDateTime dateTime;


    public static PostResponse fromEntity(Post post){
        PostResponse response = new PostResponse();
        response.setText(post.getText());
        response.setDateTime(post.getDataTime());
        return response;
    }
}
