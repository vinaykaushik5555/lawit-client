package com.lawit.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lawit.client.models.VerificationToken;

import java.util.List;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    List<VerificationToken> findByUserEmail(String email);
    List<VerificationToken> findByToken(String token);
}