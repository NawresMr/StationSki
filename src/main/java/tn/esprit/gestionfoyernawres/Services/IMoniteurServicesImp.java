package tn.esprit.gestionfoyernawres.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyernawres.Repositories.CoursRepository;
import tn.esprit.gestionfoyernawres.Repositories.MoniteurRepository;
import tn.esprit.gestionfoyernawres.entities.Cours;
import tn.esprit.gestionfoyernawres.entities.Moniteur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IMoniteurServicesImp implements IMoniteurServices {


    private final MoniteurRepository moniteurRepository;
    private final CoursRepository coursRepository;
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

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Cours cours = coursRepository.findById(numCourse).orElse(null);
        //naamel initialisation lil set w baaed naabeha bel cours
         Set<Cours > CoursSet = new HashSet<>();
         CoursSet.add(cours);
         moniteur.setCoursSet(CoursSet);
            return moniteurRepository.save(moniteur);

    }






}
