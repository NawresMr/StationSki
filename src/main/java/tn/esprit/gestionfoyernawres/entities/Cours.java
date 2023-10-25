package tn.esprit.gestionfoyernawres.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.gestionfoyernawres.entities.enums.Support;
import tn.esprit.gestionfoyernawres.entities.enums.TypeCours;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numCours;
    int niveau ;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    Support support;
    float prix;
    int creneau;

    @OneToMany(mappedBy = "cours" )//nom de l'att de classe inscription
    Set<Inscription> inscriptionSet;
}

