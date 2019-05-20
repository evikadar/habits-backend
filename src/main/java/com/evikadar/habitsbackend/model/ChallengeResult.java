package com.evikadar.habitsbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeResult {

    @GeneratedValue
    @Id
    private Long id;
    private String name;

    @ManyToOne
    @JsonIgnoreProperties({"results"})
    private Challenge challenge;
}
