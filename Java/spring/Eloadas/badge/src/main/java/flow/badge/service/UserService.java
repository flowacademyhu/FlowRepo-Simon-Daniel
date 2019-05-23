package flow.badge.service;

import flow.badge.domain.User;
import flow.badge.exception.UserAlreadyExistException;
import flow.badge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        if (user.getUserName() != null && userRepository.findById(user.getUserName()).isPresent()) {
            throw new UserAlreadyExistException(user.getUserName());
        }
        return userRepository.save(user);
    }


    public User update(User user) {
        return userRepository.save(user);
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    public List<User> listUsers() {
        return userRepository.findAll();
    }
}
