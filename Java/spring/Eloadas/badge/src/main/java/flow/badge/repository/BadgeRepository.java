package flow.badge.repository;

import flow.badge.domain.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<Badge, Long> {
    public void deleteById(Long id);

}
