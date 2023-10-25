package tn.esprit.gestionfoyernawres.Services;

import tn.esprit.gestionfoyernawres.entities.Abonnement;

import java.util.List;

public interface IAbonnementServices {
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    List<Abonnement> findAll();
    Abonnement findById(long numAbon );
    void deleteById(long numAbon );
}
