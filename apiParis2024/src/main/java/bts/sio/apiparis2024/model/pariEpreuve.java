package bts.sio.apiparis2024.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pariEpreuve")
public class pariEpreuve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "epreuve_id")
    private Epreuve epreuve;

    @ManyToOne
    @JoinColumn(name = "pari_id")
    private Pari pari;

    @Column(name = "cote")
    private Long cote;

    @Column(name = "place")
    private Long place;

}
