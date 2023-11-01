package tn.esprit.gestionfoyernawres.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyernawres.Repositories.AbonnementRepository;
import tn.esprit.gestionfoyernawres.entities.Abonnement;

import java.util.List;
@Service
@RequiredArgsConstructor
public class IAbonnementServicesImp implements IAbonnementServices {

   private final  AbonnementRepository abonnementRepository;

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement) ;
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public List<Abonnement> findAll() {
        return (List<Abonnement>) abonnementRepository.findAll();
    }

    @Override
    public Abonnement findById(long numAbon) {
        return abonnementRepository.findById(numAbon).orElse(null);
    }

    @Override
    public void deleteById(long numAbon) {
         abonnementRepository.deleteById(numAbon);
    }

}
