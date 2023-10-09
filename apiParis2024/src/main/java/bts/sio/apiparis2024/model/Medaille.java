package bts.sio.apiparis2024.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "medaille")
public class Medaille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

}
