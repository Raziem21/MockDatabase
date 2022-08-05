package co.develhope.h2mock.entities;

import javax.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName, lastName;
    @Column(unique = true, name = "userEmail")
    private String email;
}
