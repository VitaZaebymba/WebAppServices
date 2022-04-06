package ru.mirea.cursework.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(schema = "public",name = "report")
@Data
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String serv;
    String name;
    String mail;
    String date;
    String note;
}

