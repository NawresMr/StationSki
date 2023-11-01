package tn.esprit.gestionfoyernawres.Services;

import tn.esprit.gestionfoyernawres.entities.Inscription;
import tn.esprit.gestionfoyernawres.entities.Skieur;

import java.util.List;

public interface IInscriptionServices {
    Inscription addInscription(Inscription inscription, Long numSkieur);
    Inscription updateInscription(Inscription inscription);
    List<Inscription> findAll();
    Inscription findById(long numInscription);
    void deleteById(long numInscription);

    Inscription assignRegistrationToCourse(Long numInscription, Long numCourse);
}
