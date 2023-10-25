package tn.esprit.gestionfoyernawres.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyernawres.Repositories.SkieurRepository;
import tn.esprit.gestionfoyernawres.entities.Skieur;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ISkieurServicesImp implements ISkieurServices{

    private final SkieurRepository skieurRepository;

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
}
