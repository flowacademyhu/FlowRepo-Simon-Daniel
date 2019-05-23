package flow.badge.controller;

import flow.badge.domain.Badge;
import flow.badge.domain.User;
import flow.badge.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/badge")
public class BadgeController {
    @Autowired
    private BadgeService badgeService;

    @PostMapping("/add")
    public ResponseEntity<Badge> addBadge(@RequestBody Badge badge) {
        return ResponseEntity.ok(badgeService.save(badge));
    }

    @PutMapping("/update")
    public ResponseEntity<Badge> updateBadge(@RequestBody Badge badge) {
        return ResponseEntity.ok(badgeService.update(badge));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteBadge(@PathVariable Long id) {
        badgeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/list-badges")
    public ResponseEntity<List<Badge>> listBadges() {
        return ResponseEntity.ok(badgeService.listBadges());
    }


}
