package com.RK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RK.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
