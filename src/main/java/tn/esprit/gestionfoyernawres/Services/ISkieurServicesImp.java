package tn.esprit.gestionfoyernawres.Services;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyernawres.Repositories.PisteRepository;
import tn.esprit.gestionfoyernawres.Repositories.SkieurRepository;
import tn.esprit.gestionfoyernawres.entities.Piste;
import tn.esprit.gestionfoyernawres.entities.Skieur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ISkieurServicesImp implements ISkieurServices{

    private final SkieurRepository skieurRepository;
    private final PisteRepository pisteRepository;

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> findAll() {
        return (List<Skieur>) skieurRepository.findAll();
    }

    @Override
    public Skieur findById(long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public void deleteById(long numSkieur) {
        skieurRepository.deleteById(numSkieur);

    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Set<Piste> pisteSet = new HashSet<>();
        pisteSet.add(piste);

        Set<Skieur> skieurSet = new HashSet<>();
        skieurSet.add(skieur);

        piste.setSkieurSet(skieurSet);
        skieur.setPisteSet(pisteSet);
        return skieurRepository.save(skieur);


    }
}
