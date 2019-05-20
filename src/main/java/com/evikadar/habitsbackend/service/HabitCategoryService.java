package com.evikadar.habitsbackend.service;

import com.evikadar.habitsbackend.model.HabitCatName;
import com.evikadar.habitsbackend.model.HabitCategory;
import com.evikadar.habitsbackend.repository.HabitCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitCategoryService {

    @Autowired
    HabitCategoryRepository habitCategoryRepository;

    public void createCategories() {
        HabitCategory fitness = HabitCategory.builder()
                .name("Fitness & Looks")
                .habitCatName(HabitCatName.FITNESS_AND_HEALTH)
                .icon("icon-user-run")
                .build();
        HabitCategory mentalHealth = HabitCategory.builder()
                .name("mental-health")
                .habitCatName(HabitCatName.MENTAL_HEALTH)
                .icon("icon-palette")
                .build();
        HabitCategory familyTraditions = HabitCategory.builder()
                .name("Family Traditions")
                .habitCatName(HabitCatName.FAMILY_TRADITIONS)
                .icon("icon-bank")
                .build();
        HabitCategory personalGrowth = HabitCategory.builder()
                .name("Personal Growth")
                .habitCatName(HabitCatName.PERSONAL_GROWTH)
                .icon("icon-bulb-63")
                .build();
        HabitCategory environmentFriendliness = HabitCategory.builder()
                .name("Environmental Consciousness")
                .habitCatName(HabitCatName.ENVIRONMENTAL_CONSCIOUSNESS)
                .icon("icon-world")
                .build();
        HabitCategory socialConnections = HabitCategory.builder()
                .name("Social Connections")
                .habitCatName(HabitCatName.SOCIAL_CONNECTIONS)
                .icon("icon-heart-2")
                .build();
        HabitCategory careerSuccess = HabitCategory.builder()
                .name("Career & Success")
                .habitCatName(HabitCatName.CARREER_AND_SUCCESS)
                .icon("icon-heart-2")
                .build();
        HabitCategory moneyConscious = HabitCategory.builder()
                .name("Money Consciousness")
                .habitCatName(HabitCatName.MONEY_CONSCIOUSNESS)
                .icon("icon-coins")
                .build();
        habitCategoryRepository.save(moneyConscious);
        habitCategoryRepository.save(mentalHealth);
        habitCategoryRepository.save(personalGrowth);
        habitCategoryRepository.save(fitness);
        habitCategoryRepository.save(careerSuccess);
        habitCategoryRepository.save(socialConnections);
        habitCategoryRepository.save(environmentFriendliness);
        habitCategoryRepository.save(familyTraditions);

    }

    public HabitCategory getCategoryByName() {
        return null;
    }




}
