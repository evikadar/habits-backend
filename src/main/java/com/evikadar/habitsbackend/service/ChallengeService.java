package com.evikadar.habitsbackend.service;

import com.evikadar.habitsbackend.model.Challenge;
import com.evikadar.habitsbackend.model.ChallengeResult;
import com.evikadar.habitsbackend.model.HabitCategory;
import com.evikadar.habitsbackend.repository.ChallengeRepository;
import com.evikadar.habitsbackend.repository.ChallengeResultRepository;
import com.evikadar.habitsbackend.repository.HabitCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChallengeService {

    @Autowired
    ChallengeRepository challengeRepository;

    @Autowired
    ChallengeResultRepository challengeResultRepository;

    @Autowired
    HabitCategoryRepository habitCategoryRepository;

    public void createChallenges(Long categoryId, String results1, String results2, String results3, String results4, String name, String shortDescription) {
        HabitCategory mentalHealth = habitCategoryRepository.findById(categoryId).orElse(null);
        Challenge meditation = Challenge.builder()
                .name(name)
                .habitCategory(mentalHealth)
                .nrOfParticipants(0)
                .shortDescription(shortDescription)
                .build();
        challengeRepository.save(meditation);
        ChallengeResult result1 = ChallengeResult.builder().name(results1).challenge(meditation).build();
        ChallengeResult result2 = ChallengeResult.builder().name(results2).challenge(meditation).build();
        ChallengeResult result3 = ChallengeResult.builder().name(results3).challenge(meditation).build();
        ChallengeResult result4 = ChallengeResult.builder().name(results4).challenge(meditation).build();
        challengeResultRepository.save(result1);
        challengeResultRepository.save(result2);
        challengeResultRepository.save(result3);
        challengeResultRepository.save(result4);
    }




}
