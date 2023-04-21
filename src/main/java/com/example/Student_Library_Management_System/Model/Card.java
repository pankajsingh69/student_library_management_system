package com.example.Student_Library_Management_System.Model;

import com.example.Student_Library_Management_System.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "card_info")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp
    Date createdon;

    @UpdateTimestamp
    Date updatedon;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    public Card(){

    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @OneToOne
    @JoinColumn
    private Student student;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public Date getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Date updatedon) {
        this.updatedon = updatedon;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
