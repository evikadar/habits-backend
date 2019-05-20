package com.evikadar.habitsbackend.repository;

import com.evikadar.habitsbackend.model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

    @Query("SELECT c FROM Challenge c WHERE c.habitCategory.id = :habitCategoryId")
    List<Challenge> getChallengeByHabitCategory(@Param("habitCategoryId") Long id);

    @Query("SELECT c FROM Challenge c WHERE c.id = :challengeId")
    Challenge getChallengeById(@Param("challengeId") Long id);




}
