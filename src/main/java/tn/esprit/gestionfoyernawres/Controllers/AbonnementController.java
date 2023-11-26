package tn.esprit.gestionfoyernawres.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyernawres.Services.IAbonnementServices;
import tn.esprit.gestionfoyernawres.entities.Abonnement;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/abonnement")
public class AbonnementController {
    private final IAbonnementServices iAbonnementServices;

    @PostMapping
    public void addAbonnement(@RequestBody Abonnement abonnement){

        iAbonnementServices.addAbonnement(abonnement);
    }
     @PutMapping
    public void updateAbonnement(@RequestBody Abonnement abonnement){
        iAbonnementServices.updateAbonnement(abonnement);
    }
    @GetMapping("/{numAbonnement}")
    public Abonnement findById(@PathVariable long numAbonnement)    {
        return iAbonnementServices.findById(numAbonnement);
    }
    @GetMapping
    public List<Abonnement>  findAll(){
        return (List<Abonnement>) iAbonnementServices.findAll();
    }
    @DeleteMapping("/{numAbonnement}")
    public void deleteById(@PathVariable long numAbonnement){
        iAbonnementServices.deleteById(numAbonnement);
    }





}
