package tn.esprit.gestionfoyernawres.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.gestionfoyernawres.entities.Abonnement;
import tn.esprit.gestionfoyernawres.entities.enums.TypeAbonnement;

import java.util.Date;
import java.util.List;

public interface AbonnementRepository extends CrudRepository<Abonnement,Long> {
    //fonc query bel keyword
    List<Abonnement> findByTypeAbon(TypeAbonnement typeAbon);
    List<Abonnement> findByTypeAbonAndDateDebutBetween(TypeAbonnement typeAbon, Date dateDebut, Date dateDebut2);
}
