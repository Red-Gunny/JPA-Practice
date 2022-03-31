package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="cafe")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cafe_id")
    private Long cafeId;

    @Column(name="nickname")
    private String nickname;

    @Builder
    public Cafe(String nickname) {
        this.nickname = nickname;
    }
}
