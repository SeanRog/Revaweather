package com.vertigo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="app_users")
public class AppUser {

    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name ="zip_code")
    private String zipCode;

    @OneToOne
    @JoinColumn(name="role_id")
    private AppUserRole appUserRole;

//    @ManyToMany
//    @JoinTable(
//            name = "user_locations",
//            joinColumns = { @JoinColumn(name = "user_id")},
//            inverseJoinColumns = { @JoinColumn(name = "location_id")}
//    )
//    private Set<Location> locations;
//
//    @OneToOne
//    @JoinTable(name = "locations")
//    private Location location;

}
