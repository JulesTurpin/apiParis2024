package bts.sio.apiparis2024.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "resultatPays")
public class ResultatPays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pays_id")
    private Pays pays;

    @ManyToOne
    @JoinColumn(name = "epreuve_id")
    private Epreuve epreuve;

    @Column(name = "place")
    private Long place;

    @Column(name = "date_result")
    private LocalDate DateResult;

}
