package flow.badge.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "badge")
public class Badge {
    @Id
    @SequenceGenerator(name = "subtaskItemSeqGenerator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "subtaskItemSeqGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private byte[] content;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_user_badge"))
    private User owner;

    @ManyToMany
    @JoinTable(
            name = "user_badges",
            joinColumns = @JoinColumn(name = "badge_id"),
            inverseJoinColumns = @JoinColumn(name = "user_username"))
    Set<User> users = new HashSet<>();

    public Badge() {
    }

    public Badge(String name, byte[] content, User owner) {
        this.name = name;
        this.content = content;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
