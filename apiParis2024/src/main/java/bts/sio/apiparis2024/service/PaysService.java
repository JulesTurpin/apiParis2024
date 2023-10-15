package bts.sio.apiparis2024.service;

import bts.sio.apiparis2024.model.Pays;
import bts.sio.apiparis2024.repository.PaysRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class PaysService {

    @Autowired
    private PaysRepository paysRepository;

    public Optional<Pays> getPays(final Long id) {
        return paysRepository.findById(id);
    }

    public Iterable<Pays> getLesPays() {
        return paysRepository.findAll();
    }

}
