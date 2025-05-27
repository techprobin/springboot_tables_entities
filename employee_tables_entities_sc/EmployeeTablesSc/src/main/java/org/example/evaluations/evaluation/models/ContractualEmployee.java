package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@MappedSuperclass //else @Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ContractualEmployee extends Employee {
    @Id
    private String alias;

    private  Double hourlyRenumeration;
}
