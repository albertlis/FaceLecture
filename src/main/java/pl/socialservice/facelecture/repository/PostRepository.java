package pl.socialservice.facelecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.socialservice.facelecture.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
