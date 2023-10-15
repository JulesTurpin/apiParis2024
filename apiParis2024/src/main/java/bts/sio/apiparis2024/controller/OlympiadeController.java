package bts.sio.apiparis2024.controller;

import bts.sio.apiparis2024.model.Olympiade;
import bts.sio.apiparis2024.model.Ville;
import bts.sio.apiparis2024.service.OlympiadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OlympiadeController {

    @Autowired
    private OlympiadeService olympiadeService;

    @PostMapping("/olympiade")
    public Olympiade createOlympiade(@RequestBody Olympiade olympiade){ return olympiadeService.saveOlympiade(olympiade);}

    @GetMapping("/olympiade/{id}")
    public Olympiade getOlympiade(@PathVariable("id") final Long id){
        Optional<Olympiade> olympiade = olympiadeService.getOlympiade(id);
        if(olympiade.isPresent()){
            return olympiade.get();
        } else {
            return null;
        }
    }

    @GetMapping("olympiades")
    public Iterable<Olympiade> getOlympiades(){ return olympiadeService.getLesOlympiades();}

    @PutMapping("olympiade/{id}")
    public Olympiade updateOlympiade(@PathVariable("id") final Long id, @RequestBody Olympiade olympiade){
        Optional<Olympiade> o = olympiadeService.getOlympiade(id);

        if(o.isPresent()){

            Olympiade currentOlympiade = o.get();

            String numero = olympiade.getNumero();
            if(numero != null){
                currentOlympiade.setNumero(numero);
            }

            Integer annee = olympiade.getAnnee();
            if(annee != null){
                currentOlympiade.setAnnee(annee);
            }

            Ville ville_id = olympiade.getVille();
            if(ville_id != null){
                currentOlympiade.setVille(ville_id);
            }

            olympiadeService.saveOlympiade(currentOlympiade);
            return currentOlympiade;
        } else {
            return null;
        }
    }

}
