package tn.esprit.gestionfoyernawres.Services;

import tn.esprit.gestionfoyernawres.entities.Piste;

import java.util.List;

public interface IPisteServices {

    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    List<Piste> findAll();
    Piste findById(long numPiste);
    void deleteById(long numPiste);

}
