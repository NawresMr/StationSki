package tn.esprit.gestionfoyernawres.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.gestionfoyernawres.entities.enums.Couleur;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numPiste;
    String nomPiste;
    int longeur;
    int pente;
    @Enumerated(EnumType.STRING)
    Couleur couleur;

    @ManyToMany(mappedBy = "pisteSet")
    Set<Skieur> skieurSet;
}
