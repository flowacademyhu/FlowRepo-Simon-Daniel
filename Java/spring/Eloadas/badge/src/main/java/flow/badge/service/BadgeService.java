package flow.badge.service;

import flow.badge.domain.Badge;
import flow.badge.exception.BadgeAlreadyExistException;
import flow.badge.repository.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    public Badge save(Badge badge) {
        if (badgeRepository.findById(badge.getId()) != null) {
            throw new BadgeAlreadyExistException(badge.getId());
        } else {
            return badgeRepository.save(badge);
        }
    }

    public Badge update(Badge badge) {
        return badgeRepository.save(badge);
    }

    public void deleteById(Long id) {
        badgeRepository.deleteById(id);
    }

    public List<Badge> listBadges() {
        return badgeRepository.findAll();
    }
}
