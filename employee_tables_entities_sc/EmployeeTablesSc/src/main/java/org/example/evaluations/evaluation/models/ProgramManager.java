package org.example.evaluations.evaluation.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProgramManager extends PermanentEmployee {
    private Long featuresCompleted;
}

