package tn.esprit.gestionfoyernawres.Services;

import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import tn.esprit.gestionfoyernawres.Repositories.CoursRepository;
import tn.esprit.gestionfoyernawres.Repositories.InscriptionRepository;
import tn.esprit.gestionfoyernawres.Repositories.PisteRepository;
import tn.esprit.gestionfoyernawres.Repositories.SkieurRepository;
import tn.esprit.gestionfoyernawres.entities.Cours;
import tn.esprit.gestionfoyernawres.entities.Inscription;
import tn.esprit.gestionfoyernawres.entities.Piste;
import tn.esprit.gestionfoyernawres.entities.Skieur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Slf4j
@Service
@RequiredArgsConstructor
public class ISkieurServicesImp implements ISkieurServices{

    private final SkieurRepository skieurRepository;
    private final PisteRepository pisteRepository;
    private  final CoursRepository coursRepository;
    private final InscriptionRepository inscriptionRepository;

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

    @Transactional
    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);

        //Set<Piste> pisteSet = new HashSet<>();
       // pisteSet.add(piste);
       // skieur.setPisteSet(pisteSet);
        //jebna les pistes l 9dom

        skieur.getPisteSet().add(piste);
        //3 lignes hedhom yaawadhhom e ligne li fou9hom
        //Set<Piste> pisteSet = skieur.getPisteSet();
         //pisteSet.add(piste);
         //skieur.setPisteSet(pisteSet);

    return skieur ;
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCourse) {
       Cours cours = coursRepository.findById(numCourse).orElse(null);
       //ajout de l'abon ysir auto
        //bech naamlou verification eli abon mawjoud
        Assert.notNull(skieur.getAbonnement(),"abonnement cannot be null");

        skieurRepository.save(skieur);
        //jebna l'inscription m skieur psq aana rel binet'hom
        //inscription jebneha m skieur eli aamalnelou save
        Inscription inscription = skieur.getInscriptionSet()
                .stream().findFirst().orElseThrow(() ->
                        new IllegalArgumentException("skieur must have at least one inscription"));

        inscription.setCours(cours);
        inscription.setSkieur(skieur);
        inscriptionRepository.save(inscription);
       return skieur;
    }
    //on doit ajouter @EnableScheduling dans la classe principale(gestionFoyerNawresApplication)
    @Scheduled(fixedRate = 60000)
    public void testscheduler(){
        //pour l'afficher dans la console
        log.info("test schedule");
    }

}
