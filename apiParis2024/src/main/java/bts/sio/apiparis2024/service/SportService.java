package bts.sio.apiparis2024.service;

import bts.sio.apiparis2024.model.Sport;
import bts.sio.apiparis2024.repository.SportRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class SportService {

    @Autowired
    private SportRepository sportRepository;

    public Optional<Sport> getSport(final Long id) {
        return sportRepository.findById(id);
    }

    public Iterable<Sport> getSports(){
        return sportRepository.findAll();
    }

    public void deleteSport(final Long id){
        sportRepository.deleteById(id);
    }

    public Sport saveSport(Sport sport){
        return sportRepository.save(sport);
    }

}

