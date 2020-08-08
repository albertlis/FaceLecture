package pl.socialservice.facelecture.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idusers")
    private long id;
    private String username;
    private String email;
    private String passwordHash;

    @OneToMany
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private List<Post> posts;
}
