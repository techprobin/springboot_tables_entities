package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@MappedSuperclass //else @Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PermanentEmployee extends Employee {
    @Id
    private String email;

    private Double costToCompany;
}
