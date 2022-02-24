package com.ms.eldportal.repository;

import com.ms.eldportal.model.jpa.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    UserProfile findByUserName(String userId);
    UserProfile findByUserNameAndPassword(String userId,String password);
}
