package tn.esprit.gestionfoyernawres.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.gestionfoyernawres.entities.Skieur;
import tn.esprit.gestionfoyernawres.entities.enums.Couleur;
import tn.esprit.gestionfoyernawres.entities.enums.Support;
import tn.esprit.gestionfoyernawres.entities.enums.TypeAbonnement;
import tn.esprit.gestionfoyernawres.entities.enums.TypeCours;

import java.util.List;

public interface SkieurRepository extends CrudRepository<Skieur,Long> {
    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement abonnement_typeAbon);
    List<Skieur> findByAbonnementTypeAbonAndPisteSetCouleurAndInscriptionSet_Cours_TypeCoursAndInscriptionSetCoursSupport
            (TypeAbonnement abonnement_typeAbon, Couleur pisteSet_couleur, TypeCours inscriptionSet_cours_typeCours, Support inscriptionSet_cours_support);

    List<Skieur> findByNomSAndAbonnement_TypeAbonAndPisteSet_Couleur(String nomS, TypeAbonnement abonnement_typeAbon, Couleur pisteSet_couleur);
//on reccupere les skieurs odre par nombre de piste
    @Query("select s from Skieur s order by size(s.pisteSet) ")
    List<Skieur> getSkieurByOrderByPisteNumber();
    //@Modifying fou9 el @Query bech taamel update  fi BD
}
