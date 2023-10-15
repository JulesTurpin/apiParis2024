package bts.sio.apiparis2024.service;

import bts.sio.apiparis2024.model.Epreuve;
import bts.sio.apiparis2024.model.Olympiade;
import bts.sio.apiparis2024.repository.OlympiadeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class OlympiadeService {

    @Autowired
    private OlympiadeRepository olympiadeRepository;

    public Optional<Olympiade> getOlympiade(final Long id) {
        return olympiadeRepository.findById(id);
    }

    public Iterable<Olympiade> getLesOlympiades() {
        return olympiadeRepository.findAll();
    }

    public Olympiade saveOlympiade(Olympiade olympiade) {
        Olympiade saveOlympiade = olympiadeRepository.save(olympiade);
        return saveOlympiade;
    }

}
