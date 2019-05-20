package com.evikadar.habitsbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class HabitCategory {

    @GeneratedValue
    @Id
    private Long id;

    // todo: return name by habit category enum type
    private String name;

    @Enumerated(EnumType.STRING)
    private HabitCatName habitCatName;

    // todo: calculate this in sql
    private int nrOfChallenges;
    private String icon;


    @OneToMany(mappedBy = "habitCategory", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @JsonIgnoreProperties({"habitCategory"})
    private List<Challenge> challenges;

}
