package org.example.evaluations.evaluation.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SoftwareDeveloper extends PermanentEmployee {
    private Long leavesTaken;
}
