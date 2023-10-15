package bts.sio.apiparis2024.service;

import bts.sio.apiparis2024.model.Epreuve;
import bts.sio.apiparis2024.repository.EpreuveRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EpreuveService {

    @Autowired
    private EpreuveRepository epreuveRepository;

    public Optional<Epreuve> getEpreuve(final Long id) {
        return epreuveRepository.findById(id);
    }

    public Iterable<Epreuve> getEpreuves() {
        return epreuveRepository.findAll();
    }

    public void deleteEpreuve(final Long id) {
        epreuveRepository.deleteById(id);
    }

    public Epreuve saveEpreuve(Epreuve epreuve) {
        Epreuve savedEpreuve = epreuveRepository.save(epreuve);
        return savedEpreuve;
    }

}
