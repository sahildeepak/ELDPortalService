package com.ms.eldportal.model.jpa;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class VideoDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String fileName;
    private String author;
    private String category;
    private String uploadedBy;
    private Date creationTime;
    private Long totalNoOfLikes;
    private Long rating;
}
