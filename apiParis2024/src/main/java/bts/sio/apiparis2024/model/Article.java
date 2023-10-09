package bts.sio.apiparis2024.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "article")
public class Article {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "titre")
    private String titre;

    @Column(name = "sousTitre")
    private String sousTitre;

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "datePublication")
    private LocalDate datePublication;

    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "pays_id")
    private Pays pays;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;

    @ManyToOne
    @JoinColumn(name = "athlete_id")
    private Athlete athlete;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

}
