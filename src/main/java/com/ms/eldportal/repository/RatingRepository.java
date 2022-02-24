package com.ms.eldportal.repository;

import com.ms.eldportal.model.jpa.Rating;
import com.ms.eldportal.model.jpa.VideoDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    Long countRatingByVideoDetail(VideoDetail videoDetail);
}
