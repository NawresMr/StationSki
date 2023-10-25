package tn.esprit.gestionfoyernawres.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyernawres.Repositories.PisteRepository;
import tn.esprit.gestionfoyernawres.entities.Piste;

import java.util.List;

@Service
public class IPisteServicesImp implements IPisteServices{
    @Autowired
    PisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public List<Piste> findAll() {
        //aamalna list<Piste> khtr pisteRepo type mte3ou liste w findAll trajaaly iterable
        return (List<Piste> )pisteRepository.findAll();
    }

    @Override
    public Piste findById(long numPiste) {
        //findById yrajaaly optionnel maaneha kn l9a yrajaa sinn yrajaaly chyy heka aaleh nzidouu orElse wala orElseThrow
        return pisteRepository.findById(numPiste).orElse(null);
        //return pisteRepository.findById(numPiste)
               // .orElseThrow(()->new IllegalArgumentException("no list found with this id "));
    }

    @Override
    public void deleteById(long numPiste) {
     pisteRepository.deleteById(numPiste);
    }
}
