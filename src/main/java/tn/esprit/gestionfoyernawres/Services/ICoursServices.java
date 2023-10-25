package tn.esprit.gestionfoyernawres.Services;

import tn.esprit.gestionfoyernawres.entities.Cours;

import java.util.List;

public interface ICoursServices {
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);
    List<Cours>  findAll();
    Cours findById(long numCours);
    void deleteById(long numCours);
}
