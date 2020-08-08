package pl.socialservice.facelecture.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.socialservice.facelecture.model.Post;
import pl.socialservice.facelecture.repository.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

}
