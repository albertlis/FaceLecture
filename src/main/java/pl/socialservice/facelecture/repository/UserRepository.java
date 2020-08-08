package pl.socialservice.facelecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.socialservice.facelecture.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("Select u From User u left join fetch u.posts")
    List<User> findAllUsers();
}
