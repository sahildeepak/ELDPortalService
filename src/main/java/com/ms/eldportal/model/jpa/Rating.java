package com.ms.eldportal.model.jpa;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Long rating;

    @OneToOne
    @JoinColumn(name="video_id", referencedColumnName = "id")
    private VideoDetail videoDetail;

    @OneToOne
    @JoinColumn(name="user_id", referencedColumnName = "id")
    private UserProfile user;

}
