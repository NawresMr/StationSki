package tn.esprit.gestionfoyernawres.Services;

import tn.esprit.gestionfoyernawres.entities.Moniteur;

import java.util.List;

public interface IMoniteurServices {
    Moniteur addMoniteur (Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    List<Moniteur> findAll();
    Moniteur findById (long numMoniteur);
    void deleteById(long numMoniteur);
}
