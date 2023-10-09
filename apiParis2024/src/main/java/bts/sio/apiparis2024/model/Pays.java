package bts.sio.apiparis2024.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pays")
public class Pays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @ManyToOne
    @JoinColumn(name = "olympiade_id")
    private Olympiade olympiade;
}
