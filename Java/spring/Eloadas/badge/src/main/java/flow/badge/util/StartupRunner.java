package flow.badge.util;

import flow.badge.domain.Badge;
import flow.badge.domain.User;
import flow.badge.repository.BadgeRepository;
import flow.badge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class StartupRunner implements CommandLineRunner {
    @Autowired
    private BadgeRepository badgeRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("feri", "Nagy Ferenc", "123456", "user");
        User user2 = new User("anna", "Nagy Anna", "123456", "user");

        userRepository.saveAndFlush(user1);
        userRepository.saveAndFlush(user2);

        Badge badge1 = new Badge("Munkásőr Jelvény", null, user1);
        Badge badge2 = new Badge("Kiváló Dolgozó", null, user2);

        badgeRepository.saveAndFlush(badge1);
        badgeRepository.saveAndFlush(badge2);


    }
}
