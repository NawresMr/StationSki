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

   /* @PostMapping
    public Inscription addInscription(@RequestBody Inscription inscription){
       return iInscriptionServices.addInscription(inscription);
    }*/
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


}
