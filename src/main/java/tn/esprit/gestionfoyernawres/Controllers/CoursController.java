package tn.esprit.gestionfoyernawres.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyernawres.Services.ICoursServices;
import tn.esprit.gestionfoyernawres.entities.Cours;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cours")
public class CoursController {
    private final ICoursServices iCoursServices;

    @PostMapping
    public Cours addCours(@RequestBody Cours cours){
        return iCoursServices.addCours(cours);
    }

    @PutMapping
    public Cours updateCours(@RequestBody Cours cours){
        return iCoursServices.updateCours(cours);
    }

    @GetMapping("/{numCours}")
    public Cours findById(@PathVariable long numCours){
        return iCoursServices.findById(numCours);
    }
    @GetMapping
    public List<Cours> findAll(){
        return (List<Cours>)  iCoursServices.findAll();
    }
    @DeleteMapping("/{numCours}")
    public void deleteById(@PathVariable long numCours){
        iCoursServices.deleteById(numCours);
    }

}
