package pl.socialservice.facelecture.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.socialservice.facelecture.model.User;
import pl.socialservice.facelecture.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public User getUser(long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
