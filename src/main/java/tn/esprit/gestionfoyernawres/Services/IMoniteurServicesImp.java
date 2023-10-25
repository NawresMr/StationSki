package tn.esprit.gestionfoyernawres.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyernawres.Repositories.MoniteurRepository;
import tn.esprit.gestionfoyernawres.entities.Moniteur;

import java.util.List;

@Service
public class IMoniteurServicesImp implements IMoniteurServices {

    @Autowired
    MoniteurRepository moniteurRepository;
    @Override
    public Moniteur addMoniteur(Moniteur moniteur){
        return moniteurRepository.save(moniteur);

    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public List<Moniteur> findAll() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur findById(long numMoniteur) {
        return moniteurRepository.findById( numMoniteur).orElse(null);
    }

    @Override
    public void deleteById(long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);

    }

}
