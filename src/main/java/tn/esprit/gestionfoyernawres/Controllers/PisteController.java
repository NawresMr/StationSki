package tn.esprit.gestionfoyernawres.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyernawres.Services.IPisteServices;
import tn.esprit.gestionfoyernawres.entities.Piste;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/piste")
public class PisteController {

    private final IPisteServices iPisteServices;

@PostMapping
    public Piste addPiste(@RequestBody Piste piste){
        return iPisteServices.addPiste(piste);
    }
    @PutMapping
    public Piste updatePiste(@RequestBody Piste piste){
        return iPisteServices.updatePiste(piste);
    }
    @GetMapping("/{numPiste}")
    public Piste findById(@PathVariable long numPiste){
        return iPisteServices.findById(numPiste);
    }
    @GetMapping
    public List<Piste>  findAll(){
        return (List<Piste>) iPisteServices.findAll();
    }
    @DeleteMapping("/{numPiste}")
    public void deleteById(@PathVariable long numPiste){
        iPisteServices.deleteById(numPiste);
    }
}
