package com.pmh.text_A.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT 이거 설정해줘...
    private Long id;

    private String nickname;

    private String password;

    private String name;

    @NotEmpty
    private String email;

    @NotEmpty
    private String phoneNumber;

    private int isAdmin;

}