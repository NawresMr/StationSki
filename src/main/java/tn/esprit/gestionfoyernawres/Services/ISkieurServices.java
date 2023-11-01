package tn.esprit.gestionfoyernawres.Services;

import tn.esprit.gestionfoyernawres.entities.Skieur;

import java.util.List;

public interface ISkieurServices {
    Skieur addSkieur (Skieur skieur);
    Skieur updateSkieur (Skieur skieur);
    List<Skieur> findAll();
    Skieur findById (long numSkieur);

    void deleteById(long numSkieur);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
}
