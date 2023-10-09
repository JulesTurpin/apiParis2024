package bts.sio.apiparis2024.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "palmares")
public class Palmares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "athlete_id")
    private Athlete athlete;

    @ManyToOne
    @JoinColumn(name = "medaille_id")
    private Medaille medaille;

    @Column(name = "annee")
    private Integer annee;

    @ManyToOne
    @JoinColumn(name = "ville_id")
    private Ville ville;

}
