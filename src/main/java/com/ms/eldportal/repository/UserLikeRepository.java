package com.ms.eldportal.repository;

import com.ms.eldportal.model.jpa.UserLike;
import com.ms.eldportal.model.jpa.UserProfile;
import com.ms.eldportal.model.jpa.VideoDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLikeRepository extends JpaRepository<UserLike, Long> {

    Long countUserLikeByVideoDetailAndUser(VideoDetail videoDetail, UserProfile userProfile);
}
