package com.ms.eldportal.model.response;

import lombok.Data;

import java.sql.Date;

@Data
public class VideoDetailVo {
    private Long id;
    private String currentUser;
    private String name;
    private String description;
    private String fileName;
    private String author;
    private String category;
    private String uploadedBy;
    private Date creationTime;
    private Long totalNoOfLikes;
    private Long rating;
    private Boolean like;
}
