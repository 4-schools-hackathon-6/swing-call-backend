package com.hackathon.server.domain.reservation.entity;

import com.hackathon.server.domain.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String day; // 예약 날짜

    private String time; // 예약 시간

    private Boolean repetition; // 매주 반복 여부

    private Float x;

    private Float y;

    private Float radius;

    @Enumerated(EnumType.STRING)
    private ReservationType type; // 기기 종류

    @ManyToOne
    @JoinColumn
    private User user;
}
