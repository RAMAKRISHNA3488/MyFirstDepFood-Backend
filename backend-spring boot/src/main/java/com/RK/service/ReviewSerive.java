package com.RK.service;

import java.util.List;

import com.RK.Exception.ReviewException;
import com.RK.model.Review;
import com.RK.model.User;
import com.RK.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
