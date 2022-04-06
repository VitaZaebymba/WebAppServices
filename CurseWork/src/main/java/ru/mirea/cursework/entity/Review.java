package ru.mirea.cursework.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(schema = "public",name = "review")
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String text;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;
    public String getAuthorName(){
        return author !=null ? author.getUsername():"Неизвестно";
    }//если у сообщения не указан автор
}
