package com.example.Blanked.accessingdata.Posts;

import com.example.Blanked.accessingdata.User;
import org.springframework.data.domain.Page;

import java.util.Optional;

public class PostServiceImpl implements PostService {
    @Override
    public Optional<Post> findForId(Long id) {
        return Optional.empty();
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public Page<Post> findByUserOrderedByDatePageable(User user, int page) {
        return null;
    }

    @Override
    public Page<Post> findAllOrderedByDatePageable(int page) {
        return null;
    }

    @Override
    public void delete(Post post) {

    }
}
