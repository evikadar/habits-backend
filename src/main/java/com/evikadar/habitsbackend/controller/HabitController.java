package com.evikadar.habitsbackend.controller;

import com.evikadar.habitsbackend.model.HabitCategory;
import com.evikadar.habitsbackend.repository.HabitCategoryRepository;
import com.evikadar.habitsbackend.service.HabitCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HabitController {

    @Autowired
    HabitCategoryRepository habitCategoryRepository;

    @Autowired
    HabitCategoryService habitCategoryService;

    @GetMapping("/habits")
    public List<HabitCategory> habitCategories() {
        habitCategoryService.createCategories();
        return habitCategoryRepository.findAll();

    }


}
