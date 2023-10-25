package tn.esprit.gestionfoyernawres.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyernawres.Repositories.InscriptionRepository;
import tn.esprit.gestionfoyernawres.entities.Inscription;

import java.util.List;
@Service
public class IInscriptionServicesImp implements IInscriptionServices{
    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public List<Inscription> findAll() {
        return (List<Inscription>) inscriptionRepository.findAll();
    }

    @Override
    public Inscription findById(long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteById(long numInscription) {
     inscriptionRepository.deleteById(numInscription);
    }
}
