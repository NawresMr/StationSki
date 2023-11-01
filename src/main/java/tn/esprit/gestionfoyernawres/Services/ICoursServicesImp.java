package tn.esprit.gestionfoyernawres.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyernawres.Repositories.CoursRepository;
import tn.esprit.gestionfoyernawres.entities.Cours;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ICoursServicesImp implements ICoursServices{

   private final CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public List<Cours> findAll() {
        return (List<Cours>) coursRepository.findAll();
    }

    @Override
    public Cours findById(long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }

    @Override
    public void deleteById(long numCours) {
   coursRepository.deleteById(numCours);
    }
}
