package tn.esprit.gestionfoyernawres.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)

public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numInscription;
    int numSemaine ;
    @ManyToOne
    Cours cours;

    @ManyToOne
    Skieur skieur;
}
