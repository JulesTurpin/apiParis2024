package bts.sio.apiparis2024.controller;

import bts.sio.apiparis2024.model.Epreuve;
import bts.sio.apiparis2024.model.Pays;
import bts.sio.apiparis2024.model.ResultatPays;
import bts.sio.apiparis2024.service.ResultatPaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
public class ResultatPaysController {

    @Autowired
    private ResultatPaysService resultatPaysService;

    @PostMapping("/epreuve_pays")
    public ResultatPays createEpreuve_Pays(@RequestBody ResultatPays resultatPays){ return resultatPaysService.saveResultatPays(resultatPays);}

    @GetMapping("/epreuve_pays/{id}")
    public ResultatPays getEpreuve_Pays(@PathVariable("id") final Long id){
        Optional<ResultatPays> resultatPays = resultatPaysService.getResultatPays(id);
        if(resultatPays.isPresent()){
            return resultatPays.get();
        } else {
            return null;
        }
    }

    @GetMapping("/epreuves_pays")
    public Iterable<ResultatPays> getEpreuves_Pays(){ return resultatPaysService.getResultatPays();}

    @PutMapping("/epreuve_pays/{id}")
    public ResultatPays updateEpreuve_Pays(@PathVariable("id") final Long id, @RequestBody ResultatPays resultatPays){
        Optional<ResultatPays> e = resultatPaysService.getResultatPays(id);
        if(e.isPresent()){
            ResultatPays currentResultatPays = e.get();

            Pays pays_id = resultatPays.getPays();
            if(pays_id != null){
                currentResultatPays.setPays(pays_id);
            }

            Epreuve epreuve_id = resultatPays.getEpreuve();
            if(epreuve_id != null){
                currentResultatPays.setEpreuve(epreuve_id);
            }

            Long place = resultatPays.getPlace();
            if(place != null){
                currentResultatPays.setPlace(place);
            }

            LocalDate DateResultat = resultatPays.getDateResult();
            if(DateResultat != null){
                currentResultatPays.setDateResult(DateResultat);
            }

            resultatPaysService.saveResultatPays(currentResultatPays);
            return currentResultatPays;
        } else {
            return null;
        }
    }

    @DeleteMapping("/epreuve_pays/{id}")
    public void deleteEpreuve_Pays(@PathVariable("id") final Long id){resultatPaysService.deleteResultatPays(id);}

}
