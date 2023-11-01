package tn.esprit.gestionfoyernawres.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyernawres.Services.ISkieurServices;
import tn.esprit.gestionfoyernawres.entities.Skieur;

import java.util.List;
//pour creer une instance de cette classe
@RestController
@RequiredArgsConstructor
//on va exposer les methodes mawjoudin fi couches services

//dans restcontroller on fait declaration de l'interface
@RequestMapping(value = "/skieur")
public class SkieurContoller {
    // on injecte une instance de l'interface iskieurservices a travers constructeur
    private final ISkieurServices iSkieurServices;


    @PostMapping
    public Skieur   addSkieur(@RequestBody Skieur skieur)
    {
        return iSkieurServices.addSkieur(skieur);
    }

    @PutMapping
    public Skieur  updateSkieur(@RequestBody Skieur skieur){
        return iSkieurServices.updateSkieur(skieur);
    }


    @GetMapping
    public List<Skieur> findAll() {
        return (List<Skieur>) iSkieurServices.findAll();
    }

    @GetMapping("/{numSkieur}")
    public Skieur findById(@PathVariable long numSkieur) {
        return iSkieurServices.findById(numSkieur);
    }

    @DeleteMapping("/{numSkieur}")
    public void deleteById(@PathVariable long numSkieur) {
        iSkieurServices.deleteById(numSkieur);
    }


    @PutMapping("/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur, @PathVariable Long numPiste){
        return iSkieurServices.assignSkierToPiste(numSkieur, numPiste);
    }
}
