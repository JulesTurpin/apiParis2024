package bts.sio.apiparis2024.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pari")
public class Pari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "place")
    private Long place;

    @Column(name = "mise")
    private Long mise;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "pays_id")
    private Pays pays;

    @ManyToOne
    @JoinColumn(name = "athlete_id")
    private Athlete athlete;

}
