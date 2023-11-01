package tn.esprit.gestionfoyernawres.Controllers;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyernawres.Services.IMoniteurServices;
import tn.esprit.gestionfoyernawres.entities.Moniteur;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/moniteur")
public class MoniteurController {
    private final IMoniteurServices iMoniteurServices;

    @PostMapping
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur){
        return iMoniteurServices.addMoniteur(moniteur);
    }

    @PutMapping
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur){
        return iMoniteurServices.updateMoniteur(moniteur);
    }

    @GetMapping("/{numMoniteur}")
    public Moniteur findById(@PathVariable long numMoniteur){
        return iMoniteurServices.findById(numMoniteur);
    }

    @GetMapping
    public List<Moniteur> findAll(){
        return (List<Moniteur>)  iMoniteurServices.findAll();
    }

    @DeleteMapping("/{numMoniteur}")
    public void deleteById(@PathVariable long numMoniteur){
        iMoniteurServices.deleteById(numMoniteur);
    }


    @PostMapping("/{numCours}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur, @PathVariable Long numCourse){
        return iMoniteurServices.addInstructorAndAssignToCourse(moniteur, numCourse);
    }
}
