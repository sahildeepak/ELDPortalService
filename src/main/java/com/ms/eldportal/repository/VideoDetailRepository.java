package com.ms.eldportal.repository;

import com.ms.eldportal.model.jpa.VideoDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoDetailRepository extends JpaRepository<VideoDetail, Long> {

    List<VideoDetail> findTop3ByCategoryOrderByRating(String category);

    List<VideoDetail> findByCategoryOrderByRating(String category);
}
