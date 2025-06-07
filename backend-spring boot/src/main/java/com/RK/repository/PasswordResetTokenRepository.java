package com.RK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RK.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
