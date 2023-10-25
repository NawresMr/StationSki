package tn.esprit.gestionfoyernawres.Services;

import tn.esprit.gestionfoyernawres.entities.Inscription;

import java.util.List;

public interface IInscriptionServices {
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    List<Inscription> findAll();
    Inscription findById(long numInscription);
    void deleteById(long numInscription);
}
