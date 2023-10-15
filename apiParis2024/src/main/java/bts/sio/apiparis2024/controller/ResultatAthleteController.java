package bts.sio.apiparis2024.controller;

import bts.sio.apiparis2024.model.Athlete;
import bts.sio.apiparis2024.model.Epreuve;
import bts.sio.apiparis2024.model.ResultatAthlete;
import bts.sio.apiparis2024.service.ResultatAthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ResultatAthleteController {

    @Autowired
    private ResultatAthleteService resultatAthleteService;

    @PostMapping("/resultatAthlete")
    public ResultatAthlete createResultatAthlete(@RequestBody ResultatAthlete resultatAthlete) { return resultatAthleteService.saveResultatAthlete(resultatAthlete);}


    @GetMapping("/resultatAthlete/{id}")
    public ResponseEntity<List<ResultatAthlete>> getResultatAthlete(@PathVariable("id") final Long id) {
        List<ResultatAthlete> resultatAthlete = resultatAthleteService.getResultatAthlete(id);
        if (!resultatAthlete.isEmpty()) {
            return ResponseEntity.ok(resultatAthlete);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/resultsAthletes")
    public Iterable<ResultatAthlete> getResultatsAthletes() { return resultatAthleteService.getResultatAthlete();}

    @PutMapping("/resultatAthlete/{id}")
    public ResponseEntity<ResultatAthlete> updateResultatAthlete(@PathVariable("id") final Long id, @RequestBody ResultatAthlete resultatAthlete) {
        List<ResultatAthlete> resultatAthletes = resultatAthleteService.getResultatAthlete(id);

        if (!resultatAthletes.isEmpty()) {
            ResultatAthlete currentResultatAthlete = resultatAthletes.get(0);

            Athlete athlete_id = resultatAthlete.getAthlete();
            if (athlete_id != null) {
                currentResultatAthlete.setAthlete(athlete_id);
            }

            Epreuve epreuve_id = resultatAthlete.getEpreuve();
            if (epreuve_id != null) {
                currentResultatAthlete.setEpreuve(epreuve_id);
            }

            Long place = resultatAthlete.getPlace();
            if (place != null) {
                currentResultatAthlete.setPlace(place);
            }

            LocalDate dateResultat = resultatAthlete.getDateResultat();
            if (dateResultat != null) {
                currentResultatAthlete.setDateResultat(dateResultat);
            }

            ResultatAthlete updatedResultatAthlete = resultatAthleteService.saveResultatAthlete(currentResultatAthlete);


            return ResponseEntity.ok(updatedResultatAthlete);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/resultatAthlete/{id}")
    public void deleteResultatAthlete(@PathVariable("id") final Long id) {
        resultatAthleteService.deleteResultatAthlete(id);
    }

}
