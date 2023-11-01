package tn.esprit.gestionfoyernawres.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyernawres.Services.IInscriptionServices;
import tn.esprit.gestionfoyernawres.entities.Inscription;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/inscription")
public class InscriptionController {
    private final IInscriptionServices iInscriptionServices;

    @PostMapping("/{numSkieur}")
    public Inscription addRegistrationAndAssignToSkier(@RequestBody Inscription inscription, @PathVariable Long numSkieur) {
        return iInscriptionServices.addInscription(inscription, numSkieur);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription inscription){

        return iInscriptionServices.updateInscription(inscription);
    }
    @GetMapping("/{numInscription}")
    public Inscription findById(@PathVariable long numInscription){
        return iInscriptionServices.findById(numInscription);
    }
    @GetMapping
    public List<Inscription> findAll(){
        return (List<Inscription>)  iInscriptionServices.findAll();
    }


    @DeleteMapping("/{numInscription}")

    public void deleteById(@PathVariable long numInscription){
        iInscriptionServices.deleteById(numInscription);
    }


    @PutMapping("add/{numInscription}/{numCourse}")
    public Inscription assignRegistrationToCourse(@PathVariable Long numInscription, @PathVariable Long numCourse) {
        return iInscriptionServices.assignRegistrationToCourse(numInscription, numCourse);
    }

}
