package tn.esprit.gestionfoyernawres.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Skieur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numSkieur;
    String nomS;
    String prenomS;
    Date dateNaissance ;
    String ville ;
//rel entre inscription et skieur est gerer par inscription donc on met mappedby
    @OneToMany(mappedBy = "skieur" )
    Set<Inscription> inscriptionSet;
    @JsonIgnore
    @ManyToMany
    Set<Piste>  pisteSet;
    //psq on a une aggregation donc n7ebou ay action ysiir aala skieur ysiir aala abonnement
    @OneToOne(cascade=CascadeType.ALL)
    Abonnement abonnement;
}
