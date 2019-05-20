package com.evikadar.habitsbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Challenge {

    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private int nrOfParticipants;
    private double averageSatisfaction;
    private double ratioToContinue;
    private String photoUrl;

    @ManyToOne
    @JsonIgnoreProperties({"challenges"})
    private HabitCategory habitCategory;

    private String habitCategoryName;

    @OneToMany(mappedBy = "challenge", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @EqualsAndHashCode.Exclude
    @Singular
    @JsonIgnoreProperties({"challenge"})
    private List<ChallengeResult> results;

    private String shortDescription;



}
