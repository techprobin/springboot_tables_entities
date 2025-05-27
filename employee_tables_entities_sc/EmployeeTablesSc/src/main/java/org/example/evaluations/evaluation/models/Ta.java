package org.example.evaluations.evaluation.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ta extends ContractualEmployee {
    private Long numberOfHelpRequests;
}
