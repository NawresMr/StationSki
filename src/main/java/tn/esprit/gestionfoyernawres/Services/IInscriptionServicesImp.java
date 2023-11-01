package tn.esprit.gestionfoyernawres.Services;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import tn.esprit.gestionfoyernawres.Repositories.CoursRepository;
import tn.esprit.gestionfoyernawres.Repositories.InscriptionRepository;
import tn.esprit.gestionfoyernawres.Repositories.SkieurRepository;
import tn.esprit.gestionfoyernawres.entities.Cours;
import tn.esprit.gestionfoyernawres.entities.Inscription;
import tn.esprit.gestionfoyernawres.entities.Skieur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IInscriptionServicesImp implements IInscriptionServices{

    private  final InscriptionRepository inscriptionRepository;
    private final SkieurRepository skieurRepository;
    private final CoursRepository coursRepository;






    @Override
    public Inscription addInscription(Inscription inscription, Long numSkieur) {
        Skieur skieur = skieurRepository.findById(numSkieur)
                .orElse(null);
        inscription.setSkieur(skieur);

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

    @Override
    public Inscription assignRegistrationToCourse(Long numInscription, Long numCourse) {
        Cours cours = coursRepository.findById(numCourse)
                .orElse(null);
        Inscription inscription = inscriptionRepository.findById(numInscription)
                .orElse(null);

        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);


    }
}
