package com.evikadar.habitsbackend.repository;

import com.evikadar.habitsbackend.model.HabitCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HabitCategoryRepository extends JpaRepository<HabitCategory, Long> {

    @Query("SELECT h FROM HabitCategory h WHERE h.name = :habitCategory")
    HabitCategory getHabitCategoryByName(@Param("habitCategory") String name);

}
