package com.ms.eldportal.model.response;

import lombok.Data;

import java.util.List;

@Data
public class CategoryVo {
    private String category;
    private List<VideoDetailVo> videoList;
}
