package com.example.Blanked.accessingdata.Posts;



import com.example.Blanked.accessingdata.User;
import org.springframework.data.domain.Page;

import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    Optional<Post> findForId(Long id);

    Post save(Post post);

    /**
     * Finds a {@link Page) of {@link Post} of provided user ordered by date
     */
    Page<Post> findByUserOrderedByDatePageable(User user, int page);

    /**
     * Finds a {@link Page) of all {@link Post} ordered by date
     */
    Page<Post> findAllOrderedByDatePageable(int page);

    void delete(Post post);
}
