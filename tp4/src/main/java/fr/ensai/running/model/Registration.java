package fr.ensai.running.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_registration")
    private Long id;

    @Column(name = "id_athlete")
    private Long idAthlete;

    @Column(name = "id_competition")
    private Long idCompetition;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Override
    public String toString() {
        return "Registration (" +
                "id=" + id +
                ", idAthlete=" + idAthlete +
                ", idCompetition=" + idCompetition +
                ", registrationDate=" + registrationDate +
                ')';
    }
}
