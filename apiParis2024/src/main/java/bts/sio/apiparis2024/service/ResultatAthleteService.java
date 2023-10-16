package bts.sio.apiparis2024.service;

import bts.sio.apiparis2024.model.ResultatAthlete;
import bts.sio.apiparis2024.repository.ResultatAthleteRepositrory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class ResultatAthleteService {

    @Autowired
    private ResultatAthleteRepositrory resultatAthleteRepositrory;

    public Optional<ResultatAthlete> getResultatAthlete(final Long id) {
        return resultatAthleteRepositrory.findById(id);
    }
    public List<ResultatAthlete> getResultatAthleteByEpreuve(final Long id) {
        return resultatAthleteRepositrory.findByEpreuve_Id(id);
    }

    public Iterable<ResultatAthlete> getResultatAthlete() {
        return resultatAthleteRepositrory.findAll();
    }

    public void deleteResultatAthlete(final Long id) {
        resultatAthleteRepositrory.deleteById(id);
    }

    public ResultatAthlete saveResultatAthlete(ResultatAthlete resultatAthlete) {
        ResultatAthlete savedResultatAthlete = resultatAthleteRepositrory.save(resultatAthlete);
        return savedResultatAthlete;
    }

}
