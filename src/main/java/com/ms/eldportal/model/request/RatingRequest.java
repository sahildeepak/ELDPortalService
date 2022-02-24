package com.ms.eldportal.model.request;

import lombok.Data;

@Data
public class RatingRequest {
    private String userId;
    private Long videoId;
    private Long rating;

}
