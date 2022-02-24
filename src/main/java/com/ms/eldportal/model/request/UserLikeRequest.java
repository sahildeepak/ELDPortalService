package com.ms.eldportal.model.request;

import lombok.Data;

@Data
public class UserLikeRequest {
    private String userId;
    private Long videoId;
}
