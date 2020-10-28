package org.example.repository;

import lombok.*;

import javax.persistence.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    private String name;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    public static User map(User user){
        return User.builder().id(user.getId()).name(user.getName()).build();
    }

}
